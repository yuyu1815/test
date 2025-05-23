/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.components.JunieThemeKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowPageKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.bridge.ToolWindowScope;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ final class ElectroJuniorToolWindowFactory$createToolWindowContent$1
/*     */   implements Function3<ToolWindowScope, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(ToolWindowScope $this$addComposeTab, Composer $composer, int $changed) {
/*  83 */     Intrinsics.checkNotNullParameter($this$addComposeTab, "$this$addComposeTab"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-803555193, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.ElectroJuniorToolWindowFactory.createToolWindowContent.<anonymous> (ElectroJuniorToolWindowFactory.kt:82)");  JunieThemeKt.JunieTheme((Function2)ComposableLambdaKt.rememberComposableLambda(-404228546, true, new Function2<Composer, Integer, Unit>(this.$model, this.$notificationService) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*  84 */             public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-404228546, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.ElectroJuniorToolWindowFactory.createToolWindowContent.<anonymous>.<anonymous> (ElectroJuniorToolWindowFactory.kt:83)"); 
/*  85 */                 $composer.startReplaceGroup(745063453); Composer composer = $composer; boolean bool = $composer.changedInstance(this.$notificationService);
/*  86 */                 JunieEventNotificationService junieEventNotificationService = this.$notificationService; int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 137 */                 Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */                 
/* 139 */                 JuniorToolWindowViewModel juniorToolWindowViewModel = this.$model; int $i$a$-cache-ElectroJuniorToolWindowFactory$createToolWindowContent$1$1$1 = 0; Object value$iv = junieEventNotificationService::invoke$lambda$1$lambda$0;
/* 140 */                 composer.updateRememberedValue(value$iv);
/* 141 */                 Function1 function1 = (bool || it$iv == Composer.Companion.getEmpty()) ? (Function1)value$iv : 
/* 142 */                   (Function1)it$iv;
/*     */                 $composer.endReplaceGroup();
/*     */                 JuniorToolWindowPageKt.JunieToolWindowContent(juniorToolWindowViewModel, function1, $composer, 0);
/*     */                 if (ComposerKt.isTraceInProgress())
/*     */                   ComposerKt.traceEventEnd();  }
/*     */               else
/*     */               { $composer.skipToGroupEnd(); }
/*     */                }
/*     */ 
/*     */             
/*     */             private static final Unit invoke$lambda$1$lambda$0(JunieEventNotificationService $notificationService, boolean it) {
/*     */               $notificationService.isToolWindowFocused().setValue(Boolean.valueOf(it));
/*     */               return Unit.INSTANCE;
/*     */             } }
/*     */           $composer, 54), $composer, 6);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */   }
/*     */   
/*     */   ElectroJuniorToolWindowFactory$createToolWindowContent$1(JuniorToolWindowViewModel $model, JunieEventNotificationService $notificationService) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ElectroJuniorToolWindowFactory$createToolWindowContent$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */