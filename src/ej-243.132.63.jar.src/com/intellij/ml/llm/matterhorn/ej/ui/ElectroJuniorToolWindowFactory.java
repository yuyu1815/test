/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModel;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.ui.ThreeComponentsSplitter;
/*     */ import com.intellij.openapi.wm.ToolWindow;
/*     */ import com.intellij.openapi.wm.ToolWindowAnchor;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.bridge.ToolWindowScope;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\b\007\030\000 \0172\0020\0012\0020\002:\002\017\020B\007¢\006\004\b\003\020\004J\036\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH@¢\006\002\020\013J\030\020\f\032\0020\0062\006\020\r\032\0020\0162\006\020\007\032\0020\bH\026¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/ElectroJuniorToolWindowFactory;", "Lcom/intellij/openapi/wm/ToolWindowFactory;", "Lcom/intellij/openapi/project/DumbAware;", "<init>", "()V", "manage", "", "toolWindow", "Lcom/intellij/openapi/wm/ToolWindow;", "toolWindowManager", "Lcom/intellij/openapi/wm/ToolWindowManager;", "(Lcom/intellij/openapi/wm/ToolWindow;Lcom/intellij/openapi/wm/ToolWindowManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createToolWindowContent", "project", "Lcom/intellij/openapi/project/Project;", "Companion", "ToggleColumnModeAction", "ej-ui"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nElectroJuniorToolWindowFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectroJuniorToolWindowFactory.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ElectroJuniorToolWindowFactory\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,136:1\n31#2,2:137\n31#2,2:139\n24#3:141\n*S KotlinDebug\n*F\n+ 1 ElectroJuniorToolWindowFactory.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ElectroJuniorToolWindowFactory\n*L\n44#1:137,2\n49#1:139,2\n52#1:141\n*E\n"})
/*     */ public final class ElectroJuniorToolWindowFactory implements ToolWindowFactory, DumbAware {
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\"\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/ElectroJuniorToolWindowFactory$Companion;", "", "<init>", "()V", "defaultThemes", "", "", "ej-ui"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @NotNull
/*  33 */   public static final Companion Companion = new Companion(null); public static final int $stable; @NotNull
/*  34 */   private static final Set<String> defaultThemes; static { String[] arrayOfString = new String[6]; arrayOfString[0] = "Dark"; arrayOfString[1] = 
/*  35 */       "Light";
/*  36 */     arrayOfString[2] = "IntelliJ Light";
/*  37 */     arrayOfString[3] = "Light with Light Header";
/*  38 */     arrayOfString[4] = "High Contrast";
/*  39 */     arrayOfString[5] = "Darcula";
/*     */     defaultThemes = SetsKt.setOf((Object[])arrayOfString); }
/*     */ 
/*     */   
/*     */   @Nullable
/*  44 */   public Object manage(@NotNull ToolWindow toolWindow, @NotNull ToolWindowManager toolWindowManager, @NotNull Continuation<? super Unit> $completion) { Intrinsics.checkNotNullExpressionValue(toolWindow.getProject(), "getProject(...)"); ComponentManager $this$service$iv = (ComponentManager)toolWindow.getProject(); int $i$f$service = 0;
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
/* 137 */     Class<JunieEventNotificationService> serviceClass$iv = JunieEventNotificationService.class;
/* 138 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  if (((JunieEventNotificationService)$this$service$iv.getService(serviceClass$iv)).manageIconInToolbar(toolWindow, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return ((JunieEventNotificationService)$this$service$iv.getService(serviceClass$iv)).manageIconInToolbar(toolWindow, $completion);  ((JunieEventNotificationService)$this$service$iv.getService(serviceClass$iv)).manageIconInToolbar(toolWindow, $completion); return Unit.INSTANCE; } public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) { Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(toolWindow, "toolWindow"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/* 139 */     Class<JunieEventNotificationService> serviceClass$iv = JunieEventNotificationService.class;
/* 140 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  JunieEventNotificationService notificationService = (JunieEventNotificationService)$this$service$iv.getService(serviceClass$iv); Object $this$thisLogger$iv = this; int $i$f$thisLogger = 0;
/* 141 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ElectroJuniorToolWindowFactory.class), "getInstance(...)"); Logger logger = Logger.getInstance(ElectroJuniorToolWindowFactory.class); if (AppMode.isRemoteDevHost()) { UtilsKt.showRemoteDevNotSupportedMessage(toolWindow); return; }  if (UtilsKt.isWindowsArm64()) { UtilsKt.showUnsupportedArchMessage(toolWindow, "Windows ARM"); return; }  String themeName = LafManager.getInstance().getCurrentUIThemeLookAndFeel().getName(); if (!defaultThemes.contains(themeName)) { UtilsKt.showThemeUnsupportedMessage(project, themeName); logger.warn("Current theme " + themeName + " is not supported, Junie toolwindow will not be shown."); }  TaskService taskService = TaskService.Companion.getInstance(project); CoroutineScope scope = MatterhornServiceScope.Companion.getScope(project); JuniorToolWindowViewModel model = new JuniorToolWindowViewModel(project, taskService, scope, (MatterhornPropertyProvider)MatterhornSettingsService.Companion.getInstance()); ActionGroup toolWindowActions = UtilsKt.buildToolWindowActions(model, project); ToolWindowExtensionsKt.addComposeTab$default(toolWindow, null, false, false, (Function3)ComposableLambdaKt.composableLambdaInstance(-803555193, true, new ElectroJuniorToolWindowFactory$createToolWindowContent$1(model, notificationService)), 7, null); toolWindow.setAdditionalGearActions(toolWindowActions); toolWindow.setTitleActions(CollectionsKt.listOf(new ToggleColumnModeAction(toolWindow))); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class ElectroJuniorToolWindowFactory$createToolWindowContent$1 implements Function3<ToolWindowScope, Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(ToolWindowScope $this$addComposeTab, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$addComposeTab, "$this$addComposeTab"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-803555193, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.ElectroJuniorToolWindowFactory.createToolWindowContent.<anonymous> (ElectroJuniorToolWindowFactory.kt:82)");  JunieThemeKt.JunieTheme((Function2)ComposableLambdaKt.rememberComposableLambda(-404228546, true, new Function2<Composer, Integer, Unit>(this.$model, this.$notificationService) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-404228546, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.ElectroJuniorToolWindowFactory.createToolWindowContent.<anonymous>.<anonymous> (ElectroJuniorToolWindowFactory.kt:83)");  $composer.startReplaceGroup(745063453); Composer composer = $composer; boolean bool = $composer.changedInstance(this.$notificationService); JunieEventNotificationService junieEventNotificationService = this.$notificationService; int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0; JuniorToolWindowViewModel juniorToolWindowViewModel = this.$model; int $i$a$-cache-ElectroJuniorToolWindowFactory$createToolWindowContent$1$1$1 = 0; Object value$iv = junieEventNotificationService::invoke$lambda$1$lambda$0; composer.updateRememberedValue(value$iv); Function1 function1 = (bool || it$iv == Composer.Companion.getEmpty()) ? (Function1)value$iv : 
/* 142 */                     (Function1)it$iv;
/*     */                   $composer.endReplaceGroup();
/*     */                   JuniorToolWindowPageKt.JunieToolWindowContent(juniorToolWindowViewModel, function1, $composer, 0);
/*     */                   if (ComposerKt.isTraceInProgress())
/*     */                     ComposerKt.traceEventEnd();  }
/*     */                 else
/*     */                 { $composer.skipToGroupEnd(); }
/*     */                  }
/*     */ 
/*     */               
/*     */               private static final Unit invoke$lambda$1$lambda$0(JunieEventNotificationService $notificationService, boolean it) {
/*     */                 $notificationService.isToolWindowFocused().setValue(Boolean.valueOf(it));
/*     */                 return Unit.INSTANCE;
/*     */               } }
/*     */             $composer, 54), $composer, 6);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd();  }
/*     */ 
/*     */     
/*     */     ElectroJuniorToolWindowFactory$createToolWindowContent$1(JuniorToolWindowViewModel $model, JunieEventNotificationService $notificationService) {} }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\020\b\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J&\020\b\032\034\022\004\022\0020\n\022\020\022\016\022\004\022\0020\n\022\004\022\0020\f0\013\030\0010\t*\0020\rH\002J\020\020\016\032\0020\f2\006\020\017\032\0020\020H\026J\020\020\021\032\0020\f2\006\020\017\032\0020\020H\026J\b\020\022\032\0020\023H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/ElectroJuniorToolWindowFactory$ToggleColumnModeAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "toolWindow", "Lcom/intellij/openapi/wm/ToolWindow;", "<init>", "(Lcom/intellij/openapi/wm/ToolWindow;)V", "getToolWindow", "()Lcom/intellij/openapi/wm/ToolWindow;", "getSizeAccessor", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "", "Lcom/intellij/openapi/ui/ThreeComponentsSplitter;", "update", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "actionPerformed", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "ej-ui"})
/*     */   @StabilityInferred(parameters = 0)
/*     */   public static final class ToggleColumnModeAction extends DumbAwareAction {
/*     */     @NotNull
/*     */     private final ToolWindow toolWindow;
/*     */     public static final int $stable = 8;
/*     */     
/*     */     public ToggleColumnModeAction(@NotNull ToolWindow toolWindow) {
/*     */       super("Toggle Column Mode", "Switch between single column and two columns mode", JunieIcons.INSTANCE.getSplitVertically());
/*     */       this.toolWindow = toolWindow;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ToolWindow getToolWindow() {
/*     */       return this.toolWindow;
/*     */     }
/*     */     
/*     */     private final Pair<Integer, Function1<Integer, Unit>> getSizeAccessor(ThreeComponentsSplitter $this$getSizeAccessor) {
/*     */       ToolWindowAnchor toolWindowAnchor = this.toolWindow.getAnchor();
/*     */       return Intrinsics.areEqual(toolWindowAnchor, ToolWindowAnchor.RIGHT) ? new Pair(Integer.valueOf($this$getSizeAccessor.getLastSize()), $this$getSizeAccessor::getSizeAccessor$lambda$0) : (Intrinsics.areEqual(toolWindowAnchor, ToolWindowAnchor.LEFT) ? new Pair(Integer.valueOf($this$getSizeAccessor.getFirstSize()), $this$getSizeAccessor::getSizeAccessor$lambda$1) : null);
/*     */     }
/*     */     
/*     */     private static final Unit getSizeAccessor$lambda$0(ThreeComponentsSplitter $this_getSizeAccessor, int newSize) {
/*     */       $this_getSizeAccessor.setLastSize(newSize);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     private static final Unit getSizeAccessor$lambda$1(ThreeComponentsSplitter $this_getSizeAccessor, int newSize) {
/*     */       $this_getSizeAccessor.setFirstSize(newSize);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     public void update(@NotNull AnActionEvent e) {
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       ThreeComponentsSplitter splitter = (ThreeComponentsSplitter)ComponentUtil.getParentOfType(ThreeComponentsSplitter.class, this.toolWindow.getComponent());
/*     */       Pair<Integer, Function1<Integer, Unit>> accessor = (splitter != null) ? getSizeAccessor(splitter) : null;
/*     */       if (accessor == null) {
/*     */         e.getPresentation().setEnabledAndVisible(false);
/*     */         return;
/*     */       } 
/*     */       int compSize = ((Number)accessor.component1()).intValue();
/*     */       boolean isSingleColumn = (compSize < 625);
/*     */       e.getPresentation().setEnabledAndVisible(true);
/*     */       e.getPresentation().setText(isSingleColumn ? "Two Columns Mode" : "Single Column Mode");
/*     */       e.getPresentation().setDescription(isSingleColumn ? "Switch to two columns mode" : "Switch to single column mode");
/*     */       e.getPresentation().setIcon(JunieIcons.INSTANCE.getSplitVertically());
/*     */     }
/*     */     
/*     */     public void actionPerformed(@NotNull AnActionEvent e) {
/*     */       ThreeComponentsSplitter splitter;
/*     */       Pair<Integer, Function1<Integer, Unit>> accessor;
/*     */       Intrinsics.checkNotNullParameter(e, "e");
/*     */       if ((ThreeComponentsSplitter)ComponentUtil.getParentOfType(ThreeComponentsSplitter.class, this.toolWindow.getComponent()) == null) {
/*     */         (ThreeComponentsSplitter)ComponentUtil.getParentOfType(ThreeComponentsSplitter.class, this.toolWindow.getComponent());
/*     */         return;
/*     */       } 
/*     */       if (getSizeAccessor(splitter) == null) {
/*     */         getSizeAccessor(splitter);
/*     */         return;
/*     */       } 
/*     */       int compSize = ((Number)accessor.component1()).intValue();
/*     */       Function1 setter = (Function1)accessor.component2();
/*     */       if (compSize < 625) {
/*     */         setter.invoke(Integer.valueOf(MathKt.roundToInt(750.0D)));
/*     */       } else {
/*     */         setter.invoke(Integer.valueOf(MathKt.roundToInt(416.6666666666667D)));
/*     */       } 
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public ActionUpdateThread getActionUpdateThread() {
/*     */       return ActionUpdateThread.EDT;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ElectroJuniorToolWindowFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */