// Generated by view binder compiler. Do not edit!
package com.ass2.i181661_i190408.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ass2.i181661_i190408.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class Screen21Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button bt2;

  @NonNull
  public final Button bt3;

  @NonNull
  public final CheckBox btShow;

  @NonNull
  public final Button button;

  private Screen21Binding(@NonNull LinearLayout rootView, @NonNull Button bt2, @NonNull Button bt3,
      @NonNull CheckBox btShow, @NonNull Button button) {
    this.rootView = rootView;
    this.bt2 = bt2;
    this.bt3 = bt3;
    this.btShow = btShow;
    this.button = button;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Screen21Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Screen21Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.screen21, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Screen21Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bt2;
      Button bt2 = ViewBindings.findChildViewById(rootView, id);
      if (bt2 == null) {
        break missingId;
      }

      id = R.id.bt3;
      Button bt3 = ViewBindings.findChildViewById(rootView, id);
      if (bt3 == null) {
        break missingId;
      }

      id = R.id.bt_show;
      CheckBox btShow = ViewBindings.findChildViewById(rootView, id);
      if (btShow == null) {
        break missingId;
      }

      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      return new Screen21Binding((LinearLayout) rootView, bt2, bt3, btShow, button);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
