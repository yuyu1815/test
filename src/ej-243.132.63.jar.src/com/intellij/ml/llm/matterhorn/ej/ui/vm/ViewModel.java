/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.vm;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\006\n\002\020\002\n\000\b'\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\006\020\013\032\0020\fR\016\020\004\032\0020\005X\004¢\006\002\n\000R\021\020\b\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;", "", "parent", "Lkotlinx/coroutines/CoroutineScope;", "vmName", "", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;)V", "scope", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "closeVM", "", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public abstract class ViewModel { @NotNull
/*    */   private final String vmName;
/*    */   
/*  7 */   public ViewModel(@NotNull CoroutineScope parent, @NotNull String vmName) { this.vmName = vmName;
/*  8 */     this.scope = CoroutineScopeKt.childScope$default(parent, this.vmName, null, false, 6, null); } @NotNull private final CoroutineScope scope; public static final int $stable = 8; @NotNull public final CoroutineScope getScope() { return this.scope; }
/*    */   
/*    */   public final void closeVM() {
/* 11 */     CoroutineScopeKt.cancel$default(this.scope, "Scope for " + this.vmName + " closed", null, 2, null);
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\vm\ViewModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */