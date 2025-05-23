/*   */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*   */ import com.intellij.openapi.extensions.ExtensionPointName;
/*   */ import kotlin.Metadata;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SensitiveFileDetector$Companion;", "", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SensitiveFileDetector;", "getEP_NAME", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "ej-core"})
/*   */ public final class Companion {
/*   */   @NotNull
/* 9 */   private static final ExtensionPointName<SensitiveFileDetector> EP_NAME = new ExtensionPointName("com.intellij.ml.llm.matterhorn.sensitiveFileDetector"); @NotNull public final ExtensionPointName<SensitiveFileDetector> getEP_NAME() { return EP_NAME; }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\SensitiveFileDetector$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */