// Generated by view binder compiler. Do not edit!
package com.ass2.i181661_i190408.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ass2.i181661_i190408.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class Screen6Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button bt1;

  @NonNull
  public final Button bt2;

  @NonNull
  public final Button songBtn;

  private Screen6Binding(@NonNull LinearLayout rootView, @NonNull Button bt1, @NonNull Button bt2,
      @NonNull Button songBtn) {
    this.rootView = rootView;
    this.bt1 = bt1;
    this.bt2 = bt2;
    this.songBtn = songBtn;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static Screen6Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Screen6Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.screen6, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Screen6Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bt1;
      Button bt1 = ViewBindings.findChildViewById(rootView, id);
      if (bt1 == null) {
        break missingId;
      }

      id = R.id.bt2;
      Button bt2 = ViewBindings.findChildViewById(rootView, id);
      if (bt2 == null) {
        break missingId;
      }

      id = R.id.song_btn;
      Button songBtn = ViewBindings.findChildViewById(rootView, id);
      if (songBtn == null) {
        break missingId;
      }

      return new Screen6Binding((LinearLayout) rootView, bt1, bt2, songBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
