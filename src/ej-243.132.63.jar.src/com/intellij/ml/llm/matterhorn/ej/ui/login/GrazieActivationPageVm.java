/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.vm.ViewModel;
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationPageVm;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;", "loginVm", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;Lkotlinx/coroutines/CoroutineScope;)V", "getLoginVm", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class GrazieActivationPageVm
/*    */   extends ViewModel
/*    */ {
/*    */   @NotNull
/*    */   private final GrazieActivationVm loginVm;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   @NotNull
/*    */   public final GrazieActivationVm getLoginVm() {
/* 24 */     return this.loginVm;
/*    */   } public GrazieActivationPageVm(@NotNull GrazieActivationVm loginVm, @NotNull CoroutineScope coroutineScope) {
/* 26 */     super(coroutineScope, "Start page loading model");
/*    */     this.loginVm = loginVm;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\GrazieActivationPageVm.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */