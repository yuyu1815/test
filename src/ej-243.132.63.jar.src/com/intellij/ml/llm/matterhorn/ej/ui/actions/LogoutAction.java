/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.actions;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.JbaAuthData;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.activation.JunieGrazieLLMProxy;
/*    */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import com.intellij.openapi.actionSystem.CommonDataKeys;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.ui.Messages;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\007\030\000 \0162\0020\001:\001\016B#\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0040\003¢\006\004\b\006\020\007J\b\020\b\032\0020\tH\026J\020\020\n\032\0020\0042\006\020\013\032\0020\fH\026J\020\020\r\032\0020\0042\006\020\013\032\0020\fH\026R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R\024\020\005\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/actions/LogoutAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "ingrazzioLogout", "Lkotlin/Function0;", "", "openJBAAccountSetting", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "update", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "actionPerformed", "Companion", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ @SourceDebugExtension({"SMAP\nLogoutAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogoutAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/actions/LogoutAction\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,92:1\n14#2:93\n*S KotlinDebug\n*F\n+ 1 LogoutAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/actions/LogoutAction\n*L\n23#1:93\n*E\n"})
/*    */ public final class LogoutAction extends DumbAwareAction {
/* 21 */   public LogoutAction(@NotNull Function0<Unit> ingrazzioLogout, @NotNull Function0<Unit> openJBAAccountSetting) { super("Logout");
/*    */     this.ingrazzioLogout = ingrazzioLogout;
/* 23 */     this.openJBAAccountSetting = openJBAAccountSetting; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/actions/LogoutAction$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "ej-ui"}) public static final class Companion { private Companion() {} @NotNull public final Logger getLogger() { return LogoutAction.logger; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Function0<Unit> ingrazzioLogout; @NotNull private final Function0<Unit> openJBAAccountSetting; public static final int $stable; static { int $i$f$logger = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 93 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(LogoutAction.class), "getInstance(...)"); } @NotNull public ActionUpdateThread getActionUpdateThread() { return ActionUpdateThread.EDT; } @NotNull private static final Logger logger = Logger.getInstance(LogoutAction.class);
/*    */   
/*    */   public void update(@NotNull AnActionEvent e) {
/*    */     Intrinsics.checkNotNullParameter(e, "e");
/*    */     Project project = (Project)e.getData(CommonDataKeys.PROJECT);
/*    */     if (project == null) {
/*    */       e.getPresentation().setEnabledAndVisible(false);
/*    */       return;
/*    */     } 
/*    */     LLMProxy lLMProxy = JuniePluginLLMProxyProvider.INSTANCE.createLLMProxy(project);
/*    */     if (lLMProxy instanceof JunieGrazieLLMProxy) {
/*    */       Object object = ((JunieGrazieLLMProxy)lLMProxy).getAuthService().getAuthFacade().getActivationState().getValue();
/*    */       AiProJbaActivation activation = (object instanceof AiProJbaActivation) ? (AiProJbaActivation)object : null;
/*    */       if (activation == null) {
/*    */         e.getPresentation().setEnabledAndVisible(false);
/*    */         return;
/*    */       } 
/*    */       JbaAuthData jbaAuthData = (JbaAuthData)Outcome.getOrNull-impl(activation.getJbaAuthStep().getOutcome-07x5Wys());
/*    */       if (jbaAuthData == null) {
/*    */         e.getPresentation().setEnabledAndVisible(false);
/*    */         return;
/*    */       } 
/*    */     } else if (!(lLMProxy instanceof com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy)) {
/*    */       e.getPresentation().setEnabledAndVisible(false);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void actionPerformed(@NotNull AnActionEvent e) {
/*    */     Intrinsics.checkNotNullParameter(e, "e");
/*    */     Project project = (Project)e.getData(CommonDataKeys.PROJECT);
/*    */     if (project == null) {
/*    */       e.getPresentation().setEnabledAndVisible(false);
/*    */       return;
/*    */     } 
/*    */     LLMProxy lLMProxy = JuniePluginLLMProxyProvider.INSTANCE.createLLMProxy(project);
/*    */     if (lLMProxy instanceof JunieGrazieLLMProxy) {
/*    */       Object object = ((JunieGrazieLLMProxy)lLMProxy).getAuthService().getAuthFacade().getActivationState().getValue();
/*    */       AiProJbaActivation activation = (object instanceof AiProJbaActivation) ? (AiProJbaActivation)object : null;
/*    */       if (activation == null) {
/*    */         e.getPresentation().setEnabledAndVisible(false);
/*    */         return;
/*    */       } 
/*    */       this.openJBAAccountSetting.invoke();
/*    */     } else if (lLMProxy instanceof com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy) {
/*    */       try {
/*    */         this.ingrazzioLogout.invoke();
/*    */       } catch (IllegalStateException stateException) {
/*    */         Messages.showMessageDialog(e.getProject(), stateException.getMessage(), "Junie", Messages.getInformationIcon());
/*    */       } catch (Throwable throwable) {
/*    */         logger.error(throwable.getMessage());
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\actions\LogoutAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */