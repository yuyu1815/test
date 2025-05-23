/*     */ package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
/*     */ import androidx.compose.runtime.EffectsKt;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.EmptyCoroutineContext;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\000\n\002\020\001\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\000\032%\020\000\032\024\022\004\022\002H\002\022\004\022\0020\003\022\004\022\002H\0020\001\"\004\b\000\020\002H\001¢\006\002\020\004\032K\020\000\032\024\022\004\022\002H\002\022\004\022\002H\005\022\004\022\002H\0060\001\"\004\b\000\020\002\"\004\b\001\020\005\"\004\b\002\020\0062\030\020\007\032\024\022\004\022\002H\002\022\004\022\002H\005\022\004\022\002H\0060\bH\001¢\006\002\020\t\"\016\020\n\032\0020\013X\004¢\006\002\n\000¨\006\f"}, d2 = {"rememberActivityLauncher", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncher;", "Ret", "", "(Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncher;", "Err", "Val", "resultMapper", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;", "(Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncher;", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "state.junie.impl"})
/*     */ @SourceDebugExtension({"SMAP\nActivityLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityLauncher.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,80:1\n481#2:81\n480#2,4:82\n484#2,2:89\n488#2:95\n1225#3,3:86\n1228#3,3:92\n1225#3,6:96\n480#4:91\n58#5:102\n36#5,2:103\n*S KotlinDebug\n*F\n+ 1 ActivityLauncher.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncherKt\n*L\n33#1:81\n33#1:82,4\n33#1:89,2\n33#1:95\n33#1:86,3\n33#1:92,3\n34#1:96,6\n33#1:91\n79#1:102\n79#1:103,2\n*E\n"})
/*     */ public final class ActivityLauncherKt {
/*     */   @NotNull
/*     */   private static final Logger LOG;
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final <Ret> ActivityLauncher rememberActivityLauncher(@Nullable Composer $composer, int $changed) {
/*  25 */     $composer.startReplaceGroup(-394677279); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-394677279, $changed, -1, "com.intellij.ml.llm.matterhorn.activation.state.junie.activity.rememberActivityLauncher (ActivityLauncher.kt:24)"); 
/*  26 */     ActivityLauncher<?, ?, ?> activityLauncher = rememberActivityLauncher(OpResultMapper.Companion.alwaysSucceeded(), $composer, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return activityLauncher;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final <Ret, Err, Val> ActivityLauncher<Ret, Err, Val> rememberActivityLauncher(@NotNull OpResultMapper<?, ?, ?> resultMapper, @Nullable Composer $composer, int $changed) {
/*  32 */     Intrinsics.checkNotNullParameter(resultMapper, "resultMapper"); $composer.startReplaceGroup(1315043682); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1315043682, $changed, -1, "com.intellij.ml.llm.matterhorn.activation.state.junie.activity.rememberActivityLauncher (ActivityLauncher.kt:31)");  int $changed$iv = 0;
/*  33 */     int $i$f$rememberCoroutineScope = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  81 */     ComposerKt.sourceInformationMarkerStart($composer, 773894976, "CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp");
/*     */ 
/*     */     
/*  84 */     Composer composer$iv = $composer;
/*  85 */     ComposerKt.sourceInformationMarkerStart($composer, -954370320, "CC(remember):Effects.kt#9igjgp"); Composer composer2 = $composer; boolean invalid$iv$iv = false; int i = 0;
/*  86 */     Object it$iv$iv = composer2.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv$iv = 0;
/*     */     
/*  88 */     int $i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv = 0;
/*     */     
/*  90 */     int $i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1 = 0; CoroutineScope coroutineScope2 = EffectsKt.createCompositionCoroutineScope(
/*  91 */         (CoroutineContext)EmptyCoroutineContext.INSTANCE, composer$iv); Object value$iv$iv = new CompositionScopedCoroutineScopeCanceller(coroutineScope2);
/*  92 */     composer2.updateRememberedValue(value$iv$iv);
/*  93 */     CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = (it$iv$iv == Composer.Companion.getEmpty()) ? (CompositionScopedCoroutineScopeCanceller)value$iv$iv : 
/*  94 */       (CompositionScopedCoroutineScopeCanceller)it$iv$iv; ComposerKt.sourceInformationMarkerEnd($composer); CompositionScopedCoroutineScopeCanceller wrapper$iv = compositionScopedCoroutineScopeCanceller1;
/*  95 */     CoroutineScope coroutineScope1 = wrapper$iv.getCoroutineScope(); ComposerKt.sourceInformationMarkerEnd($composer); CoroutineScope scope = coroutineScope1; $composer.startReplaceGroup(885859761); Composer composer1 = $composer; boolean invalid$iv = false; int $i$f$cache = 0;
/*  96 */     Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*  97 */     if (it$iv == Composer.Companion.getEmpty()) {
/*  98 */       int $i$a$-cache-ActivityLauncherKt$rememberActivityLauncher$1 = 0; Object<Object, Object, Object> value$iv = (Object<Object, Object, Object>)new ActivityLauncherImpl<>(scope, resultMapper);
/*  99 */       composer1.updateRememberedValue(value$iv);
/*     */     } 
/* 101 */     ActivityLauncherImpl<Ret, Err, Val> activityLauncherImpl2 = (ActivityLauncherImpl)it$iv; $composer.endReplaceGroup(); ActivityLauncherImpl<Ret, Err, Val> activityLauncherImpl1 = activityLauncherImpl2; if (ComposerKt.isTraceInProgress())
/* 102 */       ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return activityLauncherImpl1; } static { int $i$f$fileLogger = 0; int $i$f$currentClassLogger = 0;
/* 103 */     Class<?> clazz$iv$iv = MethodHandles.lookup().lookupClass();
/* 104 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(clazz$iv$iv), "getInstance(...)"); LOG = Logger.getInstance(clazz$iv$iv); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\ActivityLauncherKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */