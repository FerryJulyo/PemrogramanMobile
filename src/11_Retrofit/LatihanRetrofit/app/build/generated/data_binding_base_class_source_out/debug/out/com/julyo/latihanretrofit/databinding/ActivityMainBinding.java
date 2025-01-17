// Generated by data binding compiler. Do not edit!
package com.julyo.latihanretrofit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.julyo.latihanretrofit.R;
import com.julyo.latihanretrofit.models.Repo;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final Button cariBtn;

  @NonNull
  public final TextView deskripsiLabel;

  @NonNull
  public final TextView deskripsiText;

  @NonNull
  public final TextView idLabel;

  @NonNull
  public final TextView idText;

  @NonNull
  public final ProgressBar loadingBar;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView urlLabel;

  @NonNull
  public final TextView urlText;

  @NonNull
  public final EditText userEdit;

  @Bindable
  protected Repo mRepo;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button cariBtn, TextView deskripsiLabel, TextView deskripsiText, TextView idLabel,
      TextView idText, ProgressBar loadingBar, TextView textView3, TextView urlLabel,
      TextView urlText, EditText userEdit) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cariBtn = cariBtn;
    this.deskripsiLabel = deskripsiLabel;
    this.deskripsiText = deskripsiText;
    this.idLabel = idLabel;
    this.idText = idText;
    this.loadingBar = loadingBar;
    this.textView3 = textView3;
    this.urlLabel = urlLabel;
    this.urlText = urlText;
    this.userEdit = userEdit;
  }

  public abstract void setRepo(@Nullable Repo repo);

  @Nullable
  public Repo getRepo() {
    return mRepo;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}
