package com.architecture.mvp.feature.connexion.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.architecture.mvp.R;
import com.architecture.mvp.base.BaseActivity;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.ErrorCodes;
import com.firebase.ui.auth.IdpResponse;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Arrays;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ConnexionActivity extends BaseActivity implements ConnexionContrat.View {

    @Inject
    ConnexionContrat.Presenter mPresenter;

    private FirebaseAuth mAuth;

    //FOR DESIGN
    // 1 - Get Coordinator Layout
    @BindView(R.id.main_activity_coordinator_layout)
    CoordinatorLayout coordinatorLayout;

    //FOR DATA
    // 1 - Identifier for Sign-In Activity
    private static final int RC_SIGN_IN = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.attachView(this);

        mAuth = FirebaseAuth.getInstance();

    }

    @Override
    public void onStart() {
        super.onStart();
        if (mAuth.getCurrentUser() != null) {
            //onAuthSuccess(mAuth.getCurrentUser());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onDestroy() {
        mPresenter.detachView();
        super.onDestroy();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // 4 - Handle SignIn Activity response on activity result
        this.handleResponseAfterSignIn(requestCode, resultCode, data);
    }

    // --------------------
    // ACTIONS
    // --------------------

    @OnClick(R.id.main_activity_button_login)
    public void onClickLoginButton() {
        // 3 - Launch Sign-In Activity when user clicked on Login Button
        mPresenter.startSignInActivity();
    }

    @Override
    public void onStartSignInActivity() {
        startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setTheme(R.style.LoginTheme)
                        .setAvailableProviders(
                                Arrays.asList(new AuthUI.IdpConfig.EmailBuilder().build()))
                        .setIsSmartLockEnabled(false, true)
                        .setLogo(R.drawable.logo)
                        .build(),
                RC_SIGN_IN);
    }


    // 3 - Method that handles response after SignIn Activity close
    private void handleResponseAfterSignIn(int requestCode, int resultCode, Intent data){

        IdpResponse response = IdpResponse.fromResultIntent(data);

        if (requestCode == RC_SIGN_IN) {
            if (resultCode == RESULT_OK) { // SUCCESS
                showSnackBar(this.coordinatorLayout, getString(R.string.connection_succeed));
            } else { // ERRORS
                if (response == null) {
                    showSnackBar(this.coordinatorLayout, getString(R.string.error_authentication_canceled));
                } else if (response.getError().getErrorCode() == ErrorCodes.NO_NETWORK) {
                    showSnackBar(this.coordinatorLayout, getString(R.string.error_no_internet));
                } else if (response.getError().getErrorCode() == ErrorCodes.UNKNOWN_ERROR) {
                    showSnackBar(this.coordinatorLayout, getString(R.string.error_unknown_error));
                }
            }
        }
    }

    // 2 - Show Snack Bar with a message
    private void showSnackBar(CoordinatorLayout coordinatorLayout, String message){
        Snackbar.make(coordinatorLayout, message, Snackbar.LENGTH_SHORT).show();
    }


}
