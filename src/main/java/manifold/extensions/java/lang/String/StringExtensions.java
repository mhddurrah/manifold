package manifold.extensions.java.lang.String;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;

import java.lang.String;

@Extension
public class StringExtensions {
  public static boolean asBoolean(@This String thiz) {
    return Boolean.parseBoolean(thiz);
  }
}