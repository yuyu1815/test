/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.configuration.BuildConfigKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.actions.JunieGrazieLicenseInfoAction;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.actions.LogoutAction;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.actions.ShowSettingsAction;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModel;
/*     */ import com.intellij.openapi.actionSystem.ActionGroup;
/*     */ import com.intellij.openapi.actionSystem.AnAction;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.application.ApplicationManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.AdaptedFunctionReference;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J!\020\002\032\f\022\b\b\001\022\004\030\0010\0040\0032\b\020\005\032\004\030\0010\006H\026¢\006\002\020\007¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/UtilsKt$buildToolWindowActions$1", "Lcom/intellij/openapi/actionSystem/ActionGroup;", "getChildren", "", "Lcom/intellij/openapi/actionSystem/AnAction;", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "(Lcom/intellij/openapi/actionSystem/AnActionEvent;)[Lcom/intellij/openapi/actionSystem/AnAction;", "ej-ui"})
/*     */ @SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/UtilsKt$buildToolWindowActions$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,226:1\n1#2:227\n37#3,2:228\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/UtilsKt$buildToolWindowActions$1\n*L\n197#1:228,2\n*E\n"})
/*     */ public final class UtilsKt$buildToolWindowActions$1
/*     */   extends ActionGroup
/*     */ {
/*     */   UtilsKt$buildToolWindowActions$1(Project $project, JuniorToolWindowViewModel $model) {
/* 181 */     super("Junie", false);
/*     */   }
/*     */   public AnAction[] getChildren(AnActionEvent e) {
/* 184 */     AnAction[] arrayOfAnAction1 = new AnAction[4]; arrayOfAnAction1[0] = (AnAction)new ShowSettingsAction(this.$project);
/* 185 */     JunieGrazieLicenseInfoAction junieGrazieLicenseInfoAction1 = new JunieGrazieLicenseInfoAction(), junieGrazieLicenseInfoAction2 = junieGrazieLicenseInfoAction1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 227 */     boolean bool = true; AnAction[] arrayOfAnAction2 = arrayOfAnAction1; int $i$a$-takeIf-UtilsKt$buildToolWindowActions$1$getChildren$publicActions$1 = 0; boolean bool1 = BuildConfigKt.getConfig().getHasJbAI(); arrayOfAnAction2[bool] = bool1 ? (AnAction)junieGrazieLicenseInfoAction1 : null; arrayOfAnAction1[2] = new ShowJunieFeedbackDialogAction(); arrayOfAnAction1[3] = (AnAction)new LogoutAction(new UtilsKt$buildToolWindowActions$1$getChildren$publicActions$2(this.$model), new UtilsKt$buildToolWindowActions$1$getChildren$publicActions$3(this.$model)); List publicActions = CollectionsKt.listOfNotNull((Object[])arrayOfAnAction1); List internalActions = CollectionsKt.emptyList(); boolean isInternal = ApplicationManager.getApplication().isInternal(); Collection $this$toTypedArray$iv = isInternal ? CollectionsKt.plus(publicActions, internalActions) : publicActions; int $i$f$toTypedArray = 0;
/* 228 */     Collection thisCollection$iv = $this$toTypedArray$iv;
/* 229 */     return (AnAction[])thisCollection$iv.toArray((Object[])new AnAction[0]);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\UtilsKt$buildToolWindowActions$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */