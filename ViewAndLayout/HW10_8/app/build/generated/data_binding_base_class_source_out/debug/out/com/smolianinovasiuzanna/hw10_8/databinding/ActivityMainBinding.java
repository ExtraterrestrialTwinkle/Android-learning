// Generated by view binder compiler. Do not edit!
package com.smolianinovasiuzanna.hw10_8.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.smolianinovasiuzanna.hw10_8.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final LinearLayout activityMain;

  @NonNull
  public final CheckBox checkbox;

  @NonNull
  public final EditText editEmail;

  @NonNull
  public final EditText editPassword;

  @NonNull
  public final LinearLayout frame;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final Button loginButton;

  private ActivityMainBinding(@NonNull ScrollView rootView, @NonNull LinearLayout activityMain,
      @NonNull CheckBox checkbox, @NonNull EditText editEmail, @NonNull EditText editPassword,
      @NonNull LinearLayout frame, @NonNull ImageView imageView, @NonNull Button loginButton) {
    this.rootView = rootView;
    this.activityMain = activityMain;
    this.checkbox = checkbox;
    this.editEmail = editEmail;
    this.editPassword = editPassword;
    this.frame = frame;
    this.imageView = imageView;
    this.loginButton = loginButton;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.activity_main;
      LinearLayout activityMain = rootView.findViewById(id);
      if (activityMain == null) {
        break missingId;
      }

      id = R.id.checkbox;
      CheckBox checkbox = rootView.findViewById(id);
      if (checkbox == null) {
        break missingId;
      }

      id = R.id.editEmail;
      EditText editEmail = rootView.findViewById(id);
      if (editEmail == null) {
        break missingId;
      }

      id = R.id.editPassword;
      EditText editPassword = rootView.findViewById(id);
      if (editPassword == null) {
        break missingId;
      }

      id = R.id.frame;
      LinearLayout frame = rootView.findViewById(id);
      if (frame == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.loginButton;
      Button loginButton = rootView.findViewById(id);
      if (loginButton == null) {
        break missingId;
      }

      return new ActivityMainBinding((ScrollView) rootView, activityMain, checkbox, editEmail,
          editPassword, frame, imageView, loginButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
