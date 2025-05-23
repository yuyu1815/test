/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.PublishedApi;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.EmptyCoroutineContext;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CompletableJob;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.CoroutineScopeKt;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.coroutines.JobKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000d\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\006\n\002\020\021\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\032&\020\005\032\0020\0062\027\020\007\032\023\022\004\022\0020\003\022\004\022\0020\t0\b¢\006\002\b\nH\007¢\006\002\020\013\0320\020\005\032\0020\0062\b\020\f\032\004\030\0010\r2\027\020\007\032\023\022\004\022\0020\003\022\004\022\0020\t0\b¢\006\002\b\nH\007¢\006\002\020\016\032:\020\005\032\0020\0062\b\020\f\032\004\030\0010\r2\b\020\017\032\004\030\0010\r2\027\020\007\032\023\022\004\022\0020\003\022\004\022\0020\t0\b¢\006\002\b\nH\007¢\006\002\020\020\032D\020\005\032\0020\0062\b\020\f\032\004\030\0010\r2\b\020\017\032\004\030\0010\r2\b\020\021\032\004\030\0010\r2\027\020\007\032\023\022\004\022\0020\003\022\004\022\0020\t0\b¢\006\002\b\nH\007¢\006\002\020\022\032>\020\005\032\0020\0062\026\020\023\032\f\022\b\b\001\022\004\030\0010\r0\024\"\004\030\0010\r2\027\020\007\032\023\022\004\022\0020\003\022\004\022\0020\t0\b¢\006\002\b\nH\007¢\006\002\020\025\032T\020\026\032\0020\0062\b\020\f\032\004\030\0010\r2\b\020\017\032\004\030\0010\r2\b\020\021\032\004\030\0010\r2'\020\027\032#\b\001\022\004\022\0020\031\022\n\022\b\022\004\022\0020\0060\032\022\006\022\004\030\0010\r0\030¢\006\002\b\nH\007¢\006\002\020\033\032J\020\026\032\0020\0062\b\020\f\032\004\030\0010\r2\b\020\017\032\004\030\0010\r2'\020\027\032#\b\001\022\004\022\0020\031\022\n\022\b\022\004\022\0020\0060\032\022\006\022\004\030\0010\r0\030¢\006\002\b\nH\007¢\006\002\020\034\032@\020\026\032\0020\0062\b\020\f\032\004\030\0010\r2'\020\027\032#\b\001\022\004\022\0020\031\022\n\022\b\022\004\022\0020\0060\032\022\006\022\004\030\0010\r0\030¢\006\002\b\nH\007¢\006\002\020\035\032N\020\026\032\0020\0062\026\020\023\032\f\022\b\b\001\022\004\030\0010\r0\024\"\004\030\0010\r2'\020\027\032#\b\001\022\004\022\0020\031\022\n\022\b\022\004\022\0020\0060\032\022\006\022\004\030\0010\r0\030¢\006\002\b\nH\007¢\006\002\020\036\0326\020\026\032\0020\0062'\020\027\032#\b\001\022\004\022\0020\031\022\n\022\b\022\004\022\0020\0060\032\022\006\022\004\030\0010\r0\030¢\006\002\b\nH\007¢\006\002\020\037\032\033\020 \032\0020\0062\f\020\007\032\b\022\004\022\0020\0060!H\007¢\006\002\020\"\032\030\020#\032\0020\0312\006\020$\032\0020%2\006\020&\032\0020'H\001\032&\020(\032\0020\0312\023\b\006\020)\032\r\022\004\022\0020%0!¢\006\002\b*H\bø\001\000¢\006\002\020+\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\003X\004¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000\002\007\n\005\b20\001¨\006,"}, d2 = {"DisposableEffectNoParamError", "", "InternalDisposableEffectScope", "Landroidx/compose/runtime/DisposableEffectScope;", "LaunchedEffectNoParamError", "DisposableEffect", "", "effect", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectResult;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key1", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "keys", "", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "LaunchedEffect", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SideEffect", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "createCompositionCoroutineScope", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "composer", "Landroidx/compose/runtime/Composer;", "rememberCoroutineScope", "getContext", "Landroidx/compose/runtime/DisallowComposableCalls;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlinx/coroutines/CoroutineScope;", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,490:1\n1225#2,6:491\n1225#2,6:497\n1225#2,6:503\n1225#2,6:513\n1225#2,6:519\n1225#2,6:525\n1225#2,6:531\n1225#2,6:541\n1225#2,6:547\n86#3,4:509\n86#3,4:537\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n*L\n156#1:491,6\n196#1:497,6\n237#1:503,6\n277#1:513,6\n339#1:519,6\n362#1:525,6\n386#1:531,6\n413#1:541,6\n483#1:547,6\n277#1:509,4\n413#1:537,4\n*E\n"})
/*     */ public final class EffectsKt
/*     */ {
/*     */   @Composable
/*     */   public static final void SideEffect(@NotNull Function0<Unit> effect, @Nullable Composer $composer, int $changed) {
/*  48 */     Intrinsics.checkNotNullParameter(effect, "effect"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1288466761, $changed, -1, "androidx.compose.runtime.SideEffect (Effects.kt:47)");  $composer
/*  49 */       .recordSideEffect(effect); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  74 */   private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated(message = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.", level = DeprecationLevel.ERROR)
/*     */   @Composable
/*     */   public static final void DisposableEffect(@NotNull Function1 effect, @Nullable Composer $composer, int $changed) {
/* 119 */     Intrinsics.checkNotNullParameter(effect, "effect"); ComposerKt.sourceInformationMarkerStart($composer, -904483903, "C(DisposableEffect):Effects.kt#9igjgp"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-904483903, $changed, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:118)");  throw new IllegalStateException("DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.".toString());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   public static final void DisposableEffect(@Nullable Object key1, @NotNull Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> effect, @Nullable Composer $composer, int $changed)
/*     */   {
/* 155 */     Intrinsics.checkNotNullParameter(effect, "effect"); ComposerKt.sourceInformationMarkerStart($composer, -1371986847, "C(DisposableEffect)P(1)155@6197L47:Effects.kt#9igjgp"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1371986847, $changed, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:154)"); 
/* 156 */     ComposerKt.sourceInformationMarkerStart($composer, 1176203671, "CC(remember):Effects.kt#9igjgp"); Composer composer = $composer; boolean invalid$iv = $composer.changed(key1); int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 491 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 492 */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 493 */       int $i$a$-cache-EffectsKt$DisposableEffect$1 = 0; Object value$iv = new DisposableEffectImpl(effect);
/* 494 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 496 */     DisposableEffectImpl disposableEffectImpl = (DisposableEffectImpl)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); } @Composable public static final void DisposableEffect(@Nullable Object key1, @Nullable Object key2, @NotNull Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> effect, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(effect, "effect"); ComposerKt.sourceInformationMarkerStart($composer, 1429097729, "C(DisposableEffect)P(1,2)195@8083L53:Effects.kt#9igjgp"); if (ComposerKt.isTraceInProgress())
/* 497 */       ComposerKt.traceEventStart(1429097729, $changed, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:194)");  ComposerKt.sourceInformationMarkerStart($composer, 1176264029, "CC(remember):Effects.kt#9igjgp"); Composer composer = $composer; int i = $composer.changed(key1) | $composer.changed(key2), $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 498 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 499 */       int $i$a$-cache-EffectsKt$DisposableEffect$2 = 0; Object value$iv = new DisposableEffectImpl(effect);
/* 500 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 502 */     DisposableEffectImpl disposableEffectImpl = (DisposableEffectImpl)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); } @Composable public static final void DisposableEffect(@Nullable Object key1, @Nullable Object key2, @Nullable Object key3, @NotNull Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> effect, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(effect, "effect"); ComposerKt.sourceInformationMarkerStart($composer, -1239538271, "C(DisposableEffect)P(1,2,3)236@10007L59:Effects.kt#9igjgp"); if (ComposerKt.isTraceInProgress())
/* 503 */       ComposerKt.traceEventStart(-1239538271, $changed, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:235)");  ComposerKt.sourceInformationMarkerStart($composer, 1176325603, "CC(remember):Effects.kt#9igjgp"); Composer composer = $composer; int i = $composer.changed(key1) | $composer.changed(key2) | $composer.changed(key3), $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 504 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 505 */       int $i$a$-cache-EffectsKt$DisposableEffect$3 = 0; Object value$iv = new DisposableEffectImpl(effect);
/* 506 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 508 */     DisposableEffectImpl disposableEffectImpl = (DisposableEffectImpl)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); }
/* 509 */   @Deprecated(message = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.", level = DeprecationLevel.ERROR) @Composable public static final void LaunchedEffect(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(block, "block"); $composer = $composer.startRestartGroup(-805415771); ComposerKt.sourceInformation($composer, "C(LaunchedEffect):Effects.kt#9igjgp"); if (($changed & 0x1) != 0 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-805415771, $changed, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:317)");  throw new IllegalStateException("LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.".toString()); }  $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new EffectsKt$LaunchedEffect$1(block, $changed)); } else { $composer.endRestartGroup(); }  } @Composable public static final void DisposableEffect(@NotNull Object[] keys, @NotNull Function1<? super DisposableEffectScope, ? extends DisposableEffectResult> effect, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(keys, "keys"); Intrinsics.checkNotNullParameter(effect, "effect"); ComposerKt.sourceInformationMarkerStart($composer, -1307627122, "C(DisposableEffect)P(1)276@11903L48:Effects.kt#9igjgp"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1307627122, $changed, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:275)");  Object[] arrayOfObject = Arrays.copyOf(keys, keys.length); int $changed$iv = 0, $i$f$remember = 0; ComposerKt.sourceInformationMarkerStart($composer, -568225417, "CC(remember)P(1):Composables.kt#9igjgp");
/* 510 */     boolean invalid$iv = false; byte b; int i;
/* 511 */     for (b = 0, i = arrayOfObject.length; b < i; ) { Object key$iv = arrayOfObject[b]; invalid$iv |= $composer.changed(key$iv); b++; }  Composer composer = $composer;
/* 512 */     int $i$f$cache = 0;
/* 513 */     Object it$iv$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv$iv = 0;
/* 514 */     if (invalid$iv || it$iv$iv == Composer.Companion.getEmpty()) {
/* 515 */       int $i$a$-remember-EffectsKt$DisposableEffect$4 = 0; Object value$iv$iv = new DisposableEffectImpl(effect);
/* 516 */       composer.updateRememberedValue(value$iv$iv);
/*     */     } 
/* 518 */     Object object1 = it$iv$iv; ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); } @Composable public static final void LaunchedEffect(@Nullable Object key1, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(block, "block"); ComposerKt.sourceInformationMarkerStart($composer, 1179185413, "C(LaunchedEffect)P(1)338@14267L58:Effects.kt#9igjgp"); if (ComposerKt.isTraceInProgress())
/* 519 */       ComposerKt.traceEventStart(1179185413, $changed, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:336)");  CoroutineContext applyContext = $composer.getApplyCoroutineContext(); ComposerKt.sourceInformationMarkerStart($composer, 2064962644, "CC(remember):Effects.kt#9igjgp"); Composer composer = $composer; boolean invalid$iv = $composer.changed(key1); int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 520 */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 521 */       int $i$a$-cache-EffectsKt$LaunchedEffect$2 = 0; Object value$iv = new LaunchedEffectImpl(applyContext, block);
/* 522 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 524 */     LaunchedEffectImpl launchedEffectImpl = (LaunchedEffectImpl)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); } @Composable public static final void LaunchedEffect(@Nullable Object key1, @Nullable Object key2, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(block, "block"); ComposerKt.sourceInformationMarkerStart($composer, 590241125, "C(LaunchedEffect)P(1,2)361@15275L64:Effects.kt#9igjgp"); if (ComposerKt.isTraceInProgress())
/* 525 */       ComposerKt.traceEventStart(590241125, $changed, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:359)");  CoroutineContext applyContext = $composer.getApplyCoroutineContext(); ComposerKt.sourceInformationMarkerStart($composer, 2064994906, "CC(remember):Effects.kt#9igjgp"); Composer composer = $composer; int i = $composer.changed(key1) | $composer.changed(key2), $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 526 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 527 */       int $i$a$-cache-EffectsKt$LaunchedEffect$3 = 0; Object value$iv = new LaunchedEffectImpl(applyContext, block);
/* 528 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 530 */     LaunchedEffectImpl launchedEffectImpl = (LaunchedEffectImpl)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); } @Composable public static final void LaunchedEffect(@Nullable Object key1, @Nullable Object key2, @Nullable Object key3, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(block, "block"); ComposerKt.sourceInformationMarkerStart($composer, -54093371, "C(LaunchedEffect)P(1,2,3)385@16313L70:Effects.kt#9igjgp"); if (ComposerKt.isTraceInProgress())
/* 531 */       ComposerKt.traceEventStart(-54093371, $changed, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:383)");  CoroutineContext applyContext = $composer.getApplyCoroutineContext(); ComposerKt.sourceInformationMarkerStart($composer, 2065028128, "CC(remember):Effects.kt#9igjgp"); Composer composer = $composer; int i = $composer.changed(key1) | $composer.changed(key2) | $composer.changed(key3), $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 532 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 533 */       int $i$a$-cache-EffectsKt$LaunchedEffect$4 = 0; Object value$iv = new LaunchedEffectImpl(applyContext, block);
/* 534 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 536 */     LaunchedEffectImpl launchedEffectImpl = (LaunchedEffectImpl)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); } @Composable public static final void LaunchedEffect(@NotNull Object[] keys, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(keys, "keys"); Intrinsics.checkNotNullParameter(block, "block"); ComposerKt.sourceInformationMarkerStart($composer, -139560008, "C(LaunchedEffect)P(1)412@17484L59:Effects.kt#9igjgp"); if (ComposerKt.isTraceInProgress())
/* 537 */       ComposerKt.traceEventStart(-139560008, $changed, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:410)");  CoroutineContext applyContext = $composer.getApplyCoroutineContext(); Object[] arrayOfObject = Arrays.copyOf(keys, keys.length); int $changed$iv = 0, $i$f$remember = 0; ComposerKt.sourceInformationMarkerStart($composer, -568225417, "CC(remember)P(1):Composables.kt#9igjgp");
/* 538 */     boolean invalid$iv = false; byte b; int i;
/* 539 */     for (b = 0, i = arrayOfObject.length; b < i; ) { Object key$iv = arrayOfObject[b]; invalid$iv |= $composer.changed(key$iv); b++; }  Composer composer = $composer;
/* 540 */     int $i$f$cache = 0;
/* 541 */     Object it$iv$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv$iv = 0;
/* 542 */     if (invalid$iv || it$iv$iv == Composer.Companion.getEmpty()) {
/* 543 */       int $i$a$-remember-EffectsKt$LaunchedEffect$5 = 0; Object value$iv$iv = new LaunchedEffectImpl(applyContext, block);
/* 544 */       composer.updateRememberedValue(value$iv$iv);
/*     */     } 
/* 546 */     Object object1 = it$iv$iv; ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); } @PublishedApi @NotNull public static final CoroutineScope createCompositionCoroutineScope(@NotNull CoroutineContext coroutineContext, @NotNull Composer composer) { Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext"); Intrinsics.checkNotNullParameter(composer, "composer"); CompletableJob completableJob1 = JobKt.Job$default(null, 1, null), $this$createCompositionCoroutineScope_u24lambda_u248 = completableJob1; int $i$a$-apply-EffectsKt$createCompositionCoroutineScope$1 = 0; $this$createCompositionCoroutineScope_u24lambda_u248.completeExceptionally(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job")); CoroutineContext applyContext = composer.getApplyCoroutineContext(); return (coroutineContext.get((CoroutineContext.Key)Job.Key) != null) ? CoroutineScopeKt.CoroutineScope((CoroutineContext)completableJob1) : CoroutineScopeKt.CoroutineScope(applyContext.plus((CoroutineContext)JobKt.Job((Job)applyContext.get((CoroutineContext.Key)Job.Key))).plus(coroutineContext)); }
/* 547 */   @Composable @NotNull public static final CoroutineScope rememberCoroutineScope(@Nullable Function0 getContext, @Nullable Composer $composer, int $changed, int paramInt1) { int $i$f$rememberCoroutineScope = 0; ComposerKt.sourceInformationMarkerStart($composer, 773894976, "CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp"); if ((paramInt1 & 0x1) != 0) getContext = EffectsKt$rememberCoroutineScope$1.INSTANCE;  Composer composer = $composer; ComposerKt.sourceInformationMarkerStart($composer, -954370320, "CC(remember):Effects.kt#9igjgp"); Composer composer1 = $composer; boolean invalid$iv = false; int $i$f$cache = 0; Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 548 */     if (it$iv == Composer.Companion.getEmpty()) {
/* 549 */       int $i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1 = 0;
/*     */     }
/*     */     
/* 552 */     CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = (CompositionScopedCoroutineScopeCanceller)it$iv;
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     CompositionScopedCoroutineScopeCanceller wrapper = compositionScopedCoroutineScopeCanceller1;
/*     */     CoroutineScope coroutineScope = wrapper.getCoroutineScope();
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return coroutineScope; }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class EffectsKt$LaunchedEffect$1 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     EffectsKt$LaunchedEffect$1(Function2<CoroutineScope, Continuation<? super Unit>, Object> $block, int $$changed) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       EffectsKt.LaunchedEffect(this.$block, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 176)
/*     */   @SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,490:1\n*E\n"})
/*     */   public static final class EffectsKt$rememberCoroutineScope$1 extends Lambda implements Function0<EmptyCoroutineContext> {
/*     */     public static final EffectsKt$rememberCoroutineScope$1 INSTANCE = new EffectsKt$rememberCoroutineScope$1();
/*     */     
/*     */     public EffectsKt$rememberCoroutineScope$1() {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final EmptyCoroutineContext invoke() {
/*     */       return EmptyCoroutineContext.INSTANCE;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\EffectsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */