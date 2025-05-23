/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.actions;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.eula.MatterhornAgreementConfirmation;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import java.util.Iterator;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\007\030\000 \b2\0020\001:\001\bB\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/actions/ClearAgreementsAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "<init>", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "Companion", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ @SourceDebugExtension({"SMAP\nClearAgreementsAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClearAgreementsAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/actions/ClearAgreementsAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,42:1\n1863#2,2:43\n14#3:45\n*S KotlinDebug\n*F\n+ 1 ClearAgreementsAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/actions/ClearAgreementsAction\n*L\n19#1:43,2\n14#1:45\n*E\n"})
/*    */ public final class ClearAgreementsAction extends DumbAwareAction {
/* 12 */   public ClearAgreementsAction() { super("Clear Junie Agreements"); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/actions/ClearAgreementsAction$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "ej-ui"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 14 */     public final Logger getLogger() { return ClearAgreementsAction.logger; } } @NotNull public static final Companion Companion = new Companion(null); public static final int $stable; static { int $i$f$logger = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 45 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ClearAgreementsAction.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(ClearAgreementsAction.class);
/*    */   
/*    */   public void actionPerformed(@NotNull AnActionEvent e) {
/*    */     Intrinsics.checkNotNullParameter(e, "e");
/*    */     try {
/*    */       Iterable $this$forEach$iv = MatterhornAgreementConfirmation.Companion.instances();
/*    */       int $i$f$forEach = 0;
/*    */       Iterator iterator = $this$forEach$iv.iterator();
/*    */       if (iterator.hasNext()) {
/*    */         Object element$iv = iterator.next();
/*    */         MatterhornAgreementConfirmation it = (MatterhornAgreementConfirmation)element$iv;
/*    */         int $i$a$-forEach-ClearAgreementsAction$actionPerformed$1 = 0;
/*    */         it.clearAgreement();
/*    */       } 
/*    */     } catch (IllegalStateException stateException) {
/*    */       Messages.showMessageDialog(e.getProject(), stateException.getMessage(), "Junie", Messages.getInformationIcon());
/*    */     } catch (Throwable throwable) {
/*    */       logger.error(throwable.getMessage());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\actions\ClearAgreementsAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */