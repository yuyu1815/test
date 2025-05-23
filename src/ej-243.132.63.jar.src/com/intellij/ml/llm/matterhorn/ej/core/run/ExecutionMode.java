/*    */ package com.intellij.ml.llm.matterhorn.ej.core.run;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bf\030\000 \f2\0020\001:\002\f\rJ\020\020\b\032\0020\t2\006\020\n\032\0020\013H&R\024\020\002\032\0020\0038gX¦\004¢\006\006\032\004\b\004\020\005R\024\020\006\032\0020\0038gX¦\004¢\006\006\032\004\b\007\020\005¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode;", "", "id", "", "getId", "()Ljava/lang/String;", "messageBundleKey", "getMessageBundleKey", "createExecutionEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;", "root", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "Companion", "UnsafeLocal", "ej-core"})
/*    */ public interface ExecutionMode { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE; @NonNls
/*    */   @NotNull
/*    */   String getId(); @NonNls
/*    */   @NotNull
/*    */   String getMessageBundleKey(); @NotNull
/*    */   ExecutionEnvironment createExecutionEnvironment(@NotNull RootExecutionContext paramRootExecutionContext);
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020 \n\002\b\004\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\021\032\004\030\0010\0062\006\020\022\032\0020\023R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\t\032\0020\n8F¢\006\006\032\004\b\013\020\fR\027\020\r\032\b\022\004\022\0020\0060\0168F¢\006\006\032\004\b\017\020\020¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode$Companion;", "", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode;", "getEP_NAME", "()Lcom/intellij/openapi/extensions/ExtensionPointName;", "Default", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode$UnsafeLocal;", "getDefault", "()Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode$UnsafeLocal;", "entries", "", "getEntries", "()Ljava/util/List;", "find", "id", "", "ej-core"})
/*    */   public static final class Companion { @NotNull
/* 11 */     private static final ExtensionPointName<ExecutionMode> EP_NAME = new ExtensionPointName("com.intellij.ml.llm.matterhorn.run.ejExecutionMode"); @NotNull public final ExtensionPointName<ExecutionMode> getEP_NAME() { return EP_NAME; }
/*    */      @NotNull
/*    */     public final ExecutionMode.UnsafeLocal getDefault() {
/* 14 */       Intrinsics.checkNotNull(EP_NAME.findExtension(ExecutionMode.UnsafeLocal.class)); return (ExecutionMode.UnsafeLocal)EP_NAME.findExtension(ExecutionMode.UnsafeLocal.class);
/*    */     } @NotNull
/*    */     public final List<ExecutionMode> getEntries() {
/* 17 */       return EP_NAME.getExtensionList();
/*    */     }
/*    */     @Nullable
/* 20 */     public final ExecutionMode find(@NotNull String id) { Intrinsics.checkNotNullParameter(id, "id"); return (ExecutionMode)EP_NAME.findByIdOrFromInstance(id, Companion::find$lambda$0); } private static final String find$lambda$0(ExecutionMode it) { Intrinsics.checkNotNullParameter(it, "it"); return it.getId(); }
/*    */      }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\n\032\0020\0132\006\020\f\032\0020\rH\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007R\024\020\b\032\0020\0058VX\004¢\006\006\032\004\b\t\020\007¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode$UnsafeLocal;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionMode;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "messageBundleKey", "getMessageBundleKey", "createExecutionEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;", "root", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "ej-core"})
/*    */   public static final class UnsafeLocal
/*    */     implements ExecutionMode
/*    */   {
/*    */     @NotNull
/*    */     public String getId() {
/* 33 */       return "UnsafeLocal"; } @NotNull
/*    */     public String getMessageBundleKey() {
/* 35 */       return "settings.execution.mode.unsafe.local";
/*    */     } @NotNull
/*    */     public ExecutionEnvironment createExecutionEnvironment(@NotNull RootExecutionContext root) {
/* 38 */       Intrinsics.checkNotNullParameter(root, "root"); return (ExecutionEnvironment)new LocalExecutionEnvironment(AgentAction.Companion.getShell(root));
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\run\ExecutionMode.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */