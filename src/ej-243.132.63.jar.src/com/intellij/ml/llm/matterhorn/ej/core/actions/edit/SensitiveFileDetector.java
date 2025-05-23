/*   */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bf\030\000 \t2\0020\001:\001\tJ\036\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H¦@¢\006\002\020\b¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SensitiveFileDetector;", "", "isSensitiveFile", "", "project", "Lcom/intellij/openapi/project/Project;", "path", "Ljava/nio/file/Path;", "(Lcom/intellij/openapi/project/Project;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*   */ public interface SensitiveFileDetector { @NotNull
/*   */   public static final Companion Companion = Companion.$$INSTANCE;
/*   */   @Nullable
/*   */   Object isSensitiveFile(@NotNull Project paramProject, @NotNull Path paramPath, @NotNull Continuation<? super Boolean> paramContinuation);
/*   */   
/*   */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SensitiveFileDetector$Companion;", "", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SensitiveFileDetector;", "getEP_NAME", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "ej-core"})
/*   */   public static final class Companion { @NotNull
/* 9 */     private static final ExtensionPointName<SensitiveFileDetector> EP_NAME = new ExtensionPointName("com.intellij.ml.llm.matterhorn.sensitiveFileDetector"); @NotNull public final ExtensionPointName<SensitiveFileDetector> getEP_NAME() { return EP_NAME; }
/*   */      }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\SensitiveFileDetector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */