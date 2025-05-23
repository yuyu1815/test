/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.animation.core.AnimationSpecKt;
/*     */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*     */ import androidx.compose.animation.core.SpringSpec;
/*     */ import androidx.compose.animation.core.Transition;
/*     */ import androidx.compose.animation.core.VisibilityThresholdsKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.DisposableEffectResult;
/*     */ import androidx.compose.runtime.DisposableEffectScope;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.snapshots.SnapshotStateList;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000x\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032´\001\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\0022\b\b\002\020\004\032\0020\0052\037\b\002\020\006\032\031\022\n\022\b\022\004\022\002H\0020\b\022\004\022\0020\t0\007¢\006\002\b\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162%\b\002\020\017\032\037\022\023\022\021H\002¢\006\f\b\020\022\b\b\021\022\004\b\b(\003\022\006\022\004\030\0010\0220\00721\020\023\032-\022\004\022\0020\025\022\023\022\021H\002¢\006\f\b\020\022\b\b\021\022\004\b\b(\003\022\004\022\0020\0010\024¢\006\002\b\026¢\006\002\b\nH\007¢\006\002\020\027\032P\020\030\032\0020\0312\b\b\002\020\032\032\0020\0332>\b\002\020\034\0328\022\023\022\0210\035¢\006\f\b\020\022\b\b\021\022\004\b\b(\036\022\023\022\0210\035¢\006\f\b\020\022\b\b\021\022\004\b\b(\037\022\n\022\b\022\004\022\0020\0350 0\024\032¬\001\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020!2\b\b\002\020\004\032\0020\0052\037\b\002\020\006\032\031\022\n\022\b\022\004\022\002H\0020\b\022\004\022\0020\t0\007¢\006\002\b\n2\b\b\002\020\013\032\0020\f2%\b\002\020\017\032\037\022\023\022\021H\002¢\006\f\b\020\022\b\b\021\022\004\b\b(\003\022\006\022\004\030\0010\0220\00721\020\023\032-\022\004\022\0020\025\022\023\022\021H\002¢\006\f\b\020\022\b\b\021\022\004\b\b(\003\022\004\022\0020\0010\024¢\006\002\b\026¢\006\002\b\nH\007¢\006\002\020\"\032\025\020#\032\0020\t*\0020$2\006\020%\032\0020&H\004\032\025\020'\032\0020\t*\0020$2\006\020%\032\0020&H\004¨\006("}, d2 = {"AnimatedContent", "", "S", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "label", "", "contentKey", "Lkotlin/ParameterName;", "name", "", "content", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SizeTransform", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "togetherWith", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "with", "animation"})
/*     */ @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,899:1\n77#2:900\n1225#3,6:901\n1225#3,6:907\n1225#3,6:913\n1225#3,6:932\n1225#3,6:938\n350#4,7:919\n33#5,6:926\n33#5,6:972\n79#6,6:944\n86#6,4:959\n90#6,2:969\n94#6:980\n368#7,9:950\n377#7:971\n378#7,2:978\n4034#8,6:963\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt\n*L\n715#1:900\n716#1:901,6\n720#1:907,6\n721#1:913,6\n809#1:932,6\n820#1:938,6\n747#1:919,7\n756#1:926,6\n814#1:972,6\n811#1:944,6\n811#1:959,4\n811#1:969,2\n811#1:980\n811#1:950,9\n811#1:971\n811#1:978,2\n811#1:963,6\n*E\n"})
/*     */ public final class AnimatedContentKt
/*     */ {
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AnimatedContentKt$AnimatedContent$1
/*     */     extends Lambda
/*     */     implements Function1<AnimatedContentTransitionScope<S>, ContentTransform>
/*     */   {
/*     */     public static final AnimatedContentKt$AnimatedContent$1 INSTANCE = new AnimatedContentKt$AnimatedContent$1();
/*     */     
/*     */     AnimatedContentKt$AnimatedContent$1() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ContentTransform invoke(@NotNull AnimatedContentTransitionScope $this$null) {
/* 133 */       Intrinsics.checkNotNullParameter($this$null, "$this$null");
/*     */       
/* 135 */       return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default((FiniteAnimationSpec)AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0F, 2, null).plus(EnterExitTransitionKt.scaleIn-L8ZKh-E$default((FiniteAnimationSpec)AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92F, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default((FiniteAnimationSpec)AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0F, 2, null)); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AnimatedContentKt$AnimatedContent$2 extends Lambda implements Function1<S, S> { public static final AnimatedContentKt$AnimatedContent$2 INSTANCE = new AnimatedContentKt$AnimatedContent$2(); AnimatedContentKt$AnimatedContent$2() {
/*     */       super(1);
/*     */     } public final S invoke(Object it) {
/* 139 */       return (S)it; } } @Composable
/*     */   public static final <S> void AnimatedContent(Object targetState, @Nullable Modifier modifier, @Nullable Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> transitionSpec, @Nullable Alignment contentAlignment, @Nullable String label, @Nullable Function1<? super S, ? extends Object> contentKey, @NotNull Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 141 */     Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(2132720749); ComposerKt.sourceInformation($composer, "C(AnimatedContent)P(5,4,6,1,3,2)141@7507L58,142@7581L136:AnimatedContent.kt#xbi5r1"); int $dirty = $changed; if ((paramInt1 & 0x1) != 0) { $dirty |= 0x6; } else if (($changed & 0x6) == 0) { $dirty |= ((($changed & 0x8) == 0) ? $composer.changed(targetState) : $composer.changedInstance(targetState)) ? 4 : 2; }  if ((paramInt1 & 0x2) != 0) { $dirty |= 0x30; } else if (($changed & 0x30) == 0) { $dirty |= $composer.changed(modifier) ? 32 : 16; }  if ((paramInt1 & 0x4) != 0) { $dirty |= 0x180; } else if (($changed & 0x180) == 0) { $dirty |= $composer.changedInstance(transitionSpec) ? 256 : 128; }  if ((paramInt1 & 0x8) != 0) { $dirty |= 0xC00; } else if (($changed & 0xC00) == 0) { $dirty |= $composer.changed(contentAlignment) ? 2048 : 1024; }  if ((paramInt1 & 0x10) != 0) { $dirty |= 0x6000; } else if (($changed & 0x6000) == 0) { $dirty |= $composer.changed(label) ? 16384 : 8192; }  if ((paramInt1 & 0x20) != 0) { $dirty |= 0x30000; } else if (($changed & 0x30000) == 0) { $dirty |= $composer.changedInstance(contentKey) ? 131072 : 65536; }  if ((paramInt1 & 0x40) != 0) { $dirty |= 0x180000; } else if (($changed & 0x180000) == 0) { $dirty |= $composer.changedInstance(content) ? 1048576 : 524288; }  if (($dirty & 0x92493) != 599186 || !$composer.getSkipping()) { if ((paramInt1 & 0x2) != 0) {
/*     */         modifier = (Modifier)Modifier.Companion;
/*     */       }
/*     */       
/*     */       if ((paramInt1 & 0x4) != 0) {
/*     */         transitionSpec = AnimatedContentKt$AnimatedContent$1.INSTANCE;
/*     */       } }
/*     */ 
/*     */     
/* 150 */     $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new AnimatedContentKt$AnimatedContent$3((S)targetState, modifier, transitionSpec, contentAlignment, label, contentKey, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\004\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\0022\006\020\004\032\0020\002H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/unit/IntSize;", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke-TemP2vQ", "(JJ)Landroidx/compose/animation/core/SpringSpec;"})
/*     */   static final class AnimatedContentKt$SizeTransform$1
/*     */     extends Lambda
/*     */     implements Function2<IntSize, IntSize, SpringSpec<IntSize>>
/*     */   {
/*     */     public static final AnimatedContentKt$SizeTransform$1 INSTANCE = new AnimatedContentKt$SizeTransform$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final SpringSpec<IntSize> invoke-TemP2vQ(long param1Long1, long param1Long2) {
/* 225 */       return AnimationSpecKt.spring$default(0.0F, 
/* 226 */           400.0F, 
/* 227 */           IntSize.box-impl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
/*     */     } AnimatedContentKt$SizeTransform$1() { super(2); } } @NotNull
/*     */   public static final SizeTransform SizeTransform(boolean clip, @NotNull Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> sizeAnimationSpec) {
/* 230 */     Intrinsics.checkNotNullParameter(sizeAnimationSpec, "sizeAnimationSpec"); return new SizeTransformImpl(clip, sizeAnimationSpec);
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
/*     */   public static final ContentTransform togetherWith(@NotNull EnterTransition $this$togetherWith, @NotNull ExitTransition exit) {
/* 274 */     Intrinsics.checkNotNullParameter($this$togetherWith, "<this>"); Intrinsics.checkNotNullParameter(exit, "exit"); return new ContentTransform($this$togetherWith, exit, 0.0F, null, 12, null);
/*     */   }
/*     */   
/*     */   @Deprecated(message = "Infix fun EnterTransition.with(ExitTransition) has been renamed to togetherWith", replaceWith = @ReplaceWith(expression = "togetherWith(exit)", imports = {}))
/*     */   @ExperimentalAnimationApi
/*     */   @NotNull
/*     */   public static final ContentTransform with(@NotNull EnterTransition $this$with, @NotNull ExitTransition exit) {
/* 281 */     Intrinsics.checkNotNullParameter($this$with, "<this>"); Intrinsics.checkNotNullParameter(exit, "exit"); return new ContentTransform($this$with, exit, 0.0F, null, 12, null);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AnimatedContentKt$AnimatedContent$4
/*     */     extends Lambda
/*     */     implements Function1<AnimatedContentTransitionScope<S>, ContentTransform>
/*     */   {
/*     */     public static final AnimatedContentKt$AnimatedContent$4 INSTANCE = new AnimatedContentKt$AnimatedContent$4();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final ContentTransform invoke(@NotNull AnimatedContentTransitionScope $this$null) {
/* 707 */       Intrinsics.checkNotNullParameter($this$null, "$this$null");
/*     */       
/* 709 */       return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default((FiniteAnimationSpec)AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0F, 2, null).plus(EnterExitTransitionKt.scaleIn-L8ZKh-E$default((FiniteAnimationSpec)AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92F, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default((FiniteAnimationSpec)AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0F, 2, null));
/*     */     } AnimatedContentKt$AnimatedContent$4() { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AnimatedContentKt$AnimatedContent$5 extends Lambda implements Function1<S, S> { public static final AnimatedContentKt$AnimatedContent$5 INSTANCE = new AnimatedContentKt$AnimatedContent$5(); AnimatedContentKt$AnimatedContent$5() { super(1); }
/* 712 */     public final S invoke(Object it) { return (S)it; }
/*     */      }
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final <S> void AnimatedContent(@NotNull Transition $this$AnimatedContent, @Nullable Modifier modifier, @Nullable Function1 transitionSpec, @Nullable Alignment contentAlignment, @Nullable Function1 contentKey, @NotNull Function4 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #5
/*     */     //   8: ldc 'content'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #6
/*     */     //   15: ldc -114689412
/*     */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   22: astore #6
/*     */     //   24: aload #6
/*     */     //   26: ldc 'C(AnimatedContent)P(3,4,1,2)714@34537L7,715@34565L106,719@34759L51,720@34832L69,808@39387L58,809@39479L45,819@39798L52,810@39529L327:AnimatedContent.kt#xbi5r1'
/*     */     //   28: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   31: iload #7
/*     */     //   33: istore #9
/*     */     //   35: iload #8
/*     */     //   37: ldc -2147483648
/*     */     //   39: iand
/*     */     //   40: ifeq -> 53
/*     */     //   43: iload #9
/*     */     //   45: bipush #6
/*     */     //   47: ior
/*     */     //   48: istore #9
/*     */     //   50: goto -> 82
/*     */     //   53: iload #7
/*     */     //   55: bipush #6
/*     */     //   57: iand
/*     */     //   58: ifne -> 82
/*     */     //   61: iload #9
/*     */     //   63: aload #6
/*     */     //   65: aload_0
/*     */     //   66: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   71: ifeq -> 78
/*     */     //   74: iconst_4
/*     */     //   75: goto -> 79
/*     */     //   78: iconst_2
/*     */     //   79: ior
/*     */     //   80: istore #9
/*     */     //   82: iload #8
/*     */     //   84: iconst_1
/*     */     //   85: iand
/*     */     //   86: ifeq -> 99
/*     */     //   89: iload #9
/*     */     //   91: bipush #48
/*     */     //   93: ior
/*     */     //   94: istore #9
/*     */     //   96: goto -> 130
/*     */     //   99: iload #7
/*     */     //   101: bipush #48
/*     */     //   103: iand
/*     */     //   104: ifne -> 130
/*     */     //   107: iload #9
/*     */     //   109: aload #6
/*     */     //   111: aload_1
/*     */     //   112: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   117: ifeq -> 125
/*     */     //   120: bipush #32
/*     */     //   122: goto -> 127
/*     */     //   125: bipush #16
/*     */     //   127: ior
/*     */     //   128: istore #9
/*     */     //   130: iload #8
/*     */     //   132: iconst_2
/*     */     //   133: iand
/*     */     //   134: ifeq -> 148
/*     */     //   137: iload #9
/*     */     //   139: sipush #384
/*     */     //   142: ior
/*     */     //   143: istore #9
/*     */     //   145: goto -> 182
/*     */     //   148: iload #7
/*     */     //   150: sipush #384
/*     */     //   153: iand
/*     */     //   154: ifne -> 182
/*     */     //   157: iload #9
/*     */     //   159: aload #6
/*     */     //   161: aload_2
/*     */     //   162: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   167: ifeq -> 176
/*     */     //   170: sipush #256
/*     */     //   173: goto -> 179
/*     */     //   176: sipush #128
/*     */     //   179: ior
/*     */     //   180: istore #9
/*     */     //   182: iload #8
/*     */     //   184: iconst_4
/*     */     //   185: iand
/*     */     //   186: ifeq -> 200
/*     */     //   189: iload #9
/*     */     //   191: sipush #3072
/*     */     //   194: ior
/*     */     //   195: istore #9
/*     */     //   197: goto -> 234
/*     */     //   200: iload #7
/*     */     //   202: sipush #3072
/*     */     //   205: iand
/*     */     //   206: ifne -> 234
/*     */     //   209: iload #9
/*     */     //   211: aload #6
/*     */     //   213: aload_3
/*     */     //   214: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   219: ifeq -> 228
/*     */     //   222: sipush #2048
/*     */     //   225: goto -> 231
/*     */     //   228: sipush #1024
/*     */     //   231: ior
/*     */     //   232: istore #9
/*     */     //   234: iload #8
/*     */     //   236: bipush #8
/*     */     //   238: iand
/*     */     //   239: ifeq -> 253
/*     */     //   242: iload #9
/*     */     //   244: sipush #24576
/*     */     //   247: ior
/*     */     //   248: istore #9
/*     */     //   250: goto -> 288
/*     */     //   253: iload #7
/*     */     //   255: sipush #24576
/*     */     //   258: iand
/*     */     //   259: ifne -> 288
/*     */     //   262: iload #9
/*     */     //   264: aload #6
/*     */     //   266: aload #4
/*     */     //   268: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   273: ifeq -> 282
/*     */     //   276: sipush #16384
/*     */     //   279: goto -> 285
/*     */     //   282: sipush #8192
/*     */     //   285: ior
/*     */     //   286: istore #9
/*     */     //   288: iload #8
/*     */     //   290: bipush #16
/*     */     //   292: iand
/*     */     //   293: ifeq -> 306
/*     */     //   296: iload #9
/*     */     //   298: ldc 196608
/*     */     //   300: ior
/*     */     //   301: istore #9
/*     */     //   303: goto -> 338
/*     */     //   306: iload #7
/*     */     //   308: ldc 196608
/*     */     //   310: iand
/*     */     //   311: ifne -> 338
/*     */     //   314: iload #9
/*     */     //   316: aload #6
/*     */     //   318: aload #5
/*     */     //   320: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   325: ifeq -> 333
/*     */     //   328: ldc 131072
/*     */     //   330: goto -> 335
/*     */     //   333: ldc 65536
/*     */     //   335: ior
/*     */     //   336: istore #9
/*     */     //   338: iload #9
/*     */     //   340: ldc 74899
/*     */     //   342: iand
/*     */     //   343: ldc 74898
/*     */     //   345: if_icmpne -> 358
/*     */     //   348: aload #6
/*     */     //   350: invokeinterface getSkipping : ()Z
/*     */     //   355: ifne -> 1926
/*     */     //   358: iload #8
/*     */     //   360: iconst_1
/*     */     //   361: iand
/*     */     //   362: ifeq -> 372
/*     */     //   365: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   368: checkcast androidx/compose/ui/Modifier
/*     */     //   371: astore_1
/*     */     //   372: iload #8
/*     */     //   374: iconst_2
/*     */     //   375: iand
/*     */     //   376: ifeq -> 386
/*     */     //   379: getstatic androidx/compose/animation/AnimatedContentKt$AnimatedContent$4.INSTANCE : Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$4;
/*     */     //   382: checkcast kotlin/jvm/functions/Function1
/*     */     //   385: astore_2
/*     */     //   386: iload #8
/*     */     //   388: iconst_4
/*     */     //   389: iand
/*     */     //   390: ifeq -> 400
/*     */     //   393: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   396: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   399: astore_3
/*     */     //   400: iload #8
/*     */     //   402: bipush #8
/*     */     //   404: iand
/*     */     //   405: ifeq -> 416
/*     */     //   408: getstatic androidx/compose/animation/AnimatedContentKt$AnimatedContent$5.INSTANCE : Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$5;
/*     */     //   411: checkcast kotlin/jvm/functions/Function1
/*     */     //   414: astore #4
/*     */     //   416: invokestatic isTraceInProgress : ()Z
/*     */     //   419: ifeq -> 432
/*     */     //   422: ldc -114689412
/*     */     //   424: iload #9
/*     */     //   426: iconst_m1
/*     */     //   427: ldc 'androidx.compose.animation.AnimatedContent (AnimatedContent.kt:713)'
/*     */     //   429: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   432: invokestatic getLocalLayoutDirection : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   435: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   438: astore #11
/*     */     //   440: iconst_0
/*     */     //   441: istore #12
/*     */     //   443: iconst_0
/*     */     //   444: istore #13
/*     */     //   446: aload #6
/*     */     //   448: ldc 2023513938
/*     */     //   450: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   452: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   455: aload #6
/*     */     //   457: aload #11
/*     */     //   459: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   464: astore #14
/*     */     //   466: aload #6
/*     */     //   468: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   471: aload #14
/*     */     //   473: checkcast androidx/compose/ui/unit/LayoutDirection
/*     */     //   476: astore #10
/*     */     //   478: aload #6
/*     */     //   480: ldc -801903883
/*     */     //   482: ldc 'CC(remember):AnimatedContent.kt#9igjgp'
/*     */     //   484: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   487: aload #6
/*     */     //   489: astore #13
/*     */     //   491: iload #9
/*     */     //   493: bipush #14
/*     */     //   495: iand
/*     */     //   496: iconst_4
/*     */     //   497: if_icmpne -> 504
/*     */     //   500: iconst_1
/*     */     //   501: goto -> 505
/*     */     //   504: iconst_0
/*     */     //   505: istore #14
/*     */     //   507: iconst_0
/*     */     //   508: istore #15
/*     */     //   510: aload #13
/*     */     //   512: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   517: astore #16
/*     */     //   519: iconst_0
/*     */     //   520: istore #17
/*     */     //   522: iload #14
/*     */     //   524: ifne -> 538
/*     */     //   527: aload #16
/*     */     //   529: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   532: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   535: if_acmpne -> 568
/*     */     //   538: iconst_0
/*     */     //   539: istore #18
/*     */     //   541: new androidx/compose/animation/AnimatedContentTransitionScopeImpl
/*     */     //   544: dup
/*     */     //   545: aload_0
/*     */     //   546: aload_3
/*     */     //   547: aload #10
/*     */     //   549: invokespecial <init> : (Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V
/*     */     //   552: astore #19
/*     */     //   554: aload #13
/*     */     //   556: aload #19
/*     */     //   558: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   563: aload #19
/*     */     //   565: goto -> 570
/*     */     //   568: aload #16
/*     */     //   570: nop
/*     */     //   571: nop
/*     */     //   572: nop
/*     */     //   573: checkcast androidx/compose/animation/AnimatedContentTransitionScopeImpl
/*     */     //   576: astore #12
/*     */     //   578: aload #6
/*     */     //   580: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   583: aload #12
/*     */     //   585: astore #11
/*     */     //   587: aload #6
/*     */     //   589: ldc_w -801897730
/*     */     //   592: ldc 'CC(remember):AnimatedContent.kt#9igjgp'
/*     */     //   594: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   597: aload #6
/*     */     //   599: astore #14
/*     */     //   601: iload #9
/*     */     //   603: bipush #14
/*     */     //   605: iand
/*     */     //   606: iconst_4
/*     */     //   607: if_icmpne -> 614
/*     */     //   610: iconst_1
/*     */     //   611: goto -> 615
/*     */     //   614: iconst_0
/*     */     //   615: istore #15
/*     */     //   617: iconst_0
/*     */     //   618: istore #16
/*     */     //   620: aload #14
/*     */     //   622: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   627: astore #17
/*     */     //   629: iconst_0
/*     */     //   630: istore #18
/*     */     //   632: iload #15
/*     */     //   634: ifne -> 648
/*     */     //   637: aload #17
/*     */     //   639: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   642: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   645: if_acmpne -> 686
/*     */     //   648: iconst_0
/*     */     //   649: istore #19
/*     */     //   651: iconst_1
/*     */     //   652: anewarray java/lang/Object
/*     */     //   655: astore #20
/*     */     //   657: aload #20
/*     */     //   659: iconst_0
/*     */     //   660: aload_0
/*     */     //   661: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   664: aastore
/*     */     //   665: aload #20
/*     */     //   667: invokestatic mutableStateListOf : ([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*     */     //   670: astore #21
/*     */     //   672: aload #14
/*     */     //   674: aload #21
/*     */     //   676: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   681: aload #21
/*     */     //   683: goto -> 688
/*     */     //   686: aload #17
/*     */     //   688: nop
/*     */     //   689: nop
/*     */     //   690: nop
/*     */     //   691: checkcast androidx/compose/runtime/snapshots/SnapshotStateList
/*     */     //   694: astore #13
/*     */     //   696: aload #6
/*     */     //   698: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   701: aload #13
/*     */     //   703: astore #12
/*     */     //   705: aload #6
/*     */     //   707: ldc_w -801895376
/*     */     //   710: ldc 'CC(remember):AnimatedContent.kt#9igjgp'
/*     */     //   712: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   715: aload #6
/*     */     //   717: astore #15
/*     */     //   719: iload #9
/*     */     //   721: bipush #14
/*     */     //   723: iand
/*     */     //   724: iconst_4
/*     */     //   725: if_icmpne -> 732
/*     */     //   728: iconst_1
/*     */     //   729: goto -> 733
/*     */     //   732: iconst_0
/*     */     //   733: istore #16
/*     */     //   735: iconst_0
/*     */     //   736: istore #17
/*     */     //   738: aload #15
/*     */     //   740: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   745: astore #18
/*     */     //   747: iconst_0
/*     */     //   748: istore #19
/*     */     //   750: iload #16
/*     */     //   752: ifne -> 766
/*     */     //   755: aload #18
/*     */     //   757: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   760: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   763: if_acmpne -> 788
/*     */     //   766: iconst_0
/*     */     //   767: istore #20
/*     */     //   769: invokestatic mutableScatterMapOf : ()Landroidx/collection/MutableScatterMap;
/*     */     //   772: astore #20
/*     */     //   774: aload #15
/*     */     //   776: aload #20
/*     */     //   778: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   783: aload #20
/*     */     //   785: goto -> 790
/*     */     //   788: aload #18
/*     */     //   790: nop
/*     */     //   791: nop
/*     */     //   792: nop
/*     */     //   793: checkcast androidx/collection/MutableScatterMap
/*     */     //   796: astore #14
/*     */     //   798: aload #6
/*     */     //   800: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   803: aload #14
/*     */     //   805: astore #13
/*     */     //   807: aload #12
/*     */     //   809: aload_0
/*     */     //   810: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   813: invokevirtual contains : (Ljava/lang/Object;)Z
/*     */     //   816: ifne -> 834
/*     */     //   819: aload #12
/*     */     //   821: invokevirtual clear : ()V
/*     */     //   824: aload #12
/*     */     //   826: aload_0
/*     */     //   827: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   830: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   833: pop
/*     */     //   834: aload_0
/*     */     //   835: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   838: aload_0
/*     */     //   839: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   842: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   845: ifeq -> 927
/*     */     //   848: aload #12
/*     */     //   850: invokevirtual size : ()I
/*     */     //   853: iconst_1
/*     */     //   854: if_icmpne -> 873
/*     */     //   857: aload #12
/*     */     //   859: iconst_0
/*     */     //   860: invokevirtual get : (I)Ljava/lang/Object;
/*     */     //   863: aload_0
/*     */     //   864: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   867: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   870: ifne -> 888
/*     */     //   873: aload #12
/*     */     //   875: invokevirtual clear : ()V
/*     */     //   878: aload #12
/*     */     //   880: aload_0
/*     */     //   881: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   884: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   887: pop
/*     */     //   888: aload #13
/*     */     //   890: invokevirtual getSize : ()I
/*     */     //   893: iconst_1
/*     */     //   894: if_icmpne -> 909
/*     */     //   897: aload #13
/*     */     //   899: aload_0
/*     */     //   900: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   903: invokevirtual containsKey : (Ljava/lang/Object;)Z
/*     */     //   906: ifeq -> 914
/*     */     //   909: aload #13
/*     */     //   911: invokevirtual clear : ()V
/*     */     //   914: aload #11
/*     */     //   916: aload_3
/*     */     //   917: invokevirtual setContentAlignment : (Landroidx/compose/ui/Alignment;)V
/*     */     //   920: aload #11
/*     */     //   922: aload #10
/*     */     //   924: invokevirtual setLayoutDirection$animation : (Landroidx/compose/ui/unit/LayoutDirection;)V
/*     */     //   927: aload_0
/*     */     //   928: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   931: aload_0
/*     */     //   932: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   935: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   938: ifne -> 1072
/*     */     //   941: aload #12
/*     */     //   943: aload_0
/*     */     //   944: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   947: invokevirtual contains : (Ljava/lang/Object;)Z
/*     */     //   950: ifne -> 1072
/*     */     //   953: aload #12
/*     */     //   955: checkcast java/util/List
/*     */     //   958: astore #15
/*     */     //   960: iconst_0
/*     */     //   961: istore #16
/*     */     //   963: iconst_0
/*     */     //   964: istore #17
/*     */     //   966: aload #15
/*     */     //   968: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   973: astore #18
/*     */     //   975: aload #18
/*     */     //   977: invokeinterface hasNext : ()Z
/*     */     //   982: ifeq -> 1038
/*     */     //   985: aload #18
/*     */     //   987: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   992: astore #19
/*     */     //   994: aload #19
/*     */     //   996: astore #20
/*     */     //   998: iconst_0
/*     */     //   999: istore #21
/*     */     //   1001: aload #4
/*     */     //   1003: aload #20
/*     */     //   1005: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1010: aload #4
/*     */     //   1012: aload_0
/*     */     //   1013: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   1016: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1021: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1024: ifeq -> 1032
/*     */     //   1027: iload #17
/*     */     //   1029: goto -> 1039
/*     */     //   1032: iinc #17, 1
/*     */     //   1035: goto -> 975
/*     */     //   1038: iconst_m1
/*     */     //   1039: istore #14
/*     */     //   1041: iload #14
/*     */     //   1043: iconst_m1
/*     */     //   1044: if_icmpne -> 1060
/*     */     //   1047: aload #12
/*     */     //   1049: aload_0
/*     */     //   1050: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   1053: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   1056: pop
/*     */     //   1057: goto -> 1072
/*     */     //   1060: aload #12
/*     */     //   1062: iload #14
/*     */     //   1064: aload_0
/*     */     //   1065: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   1068: invokevirtual set : (ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   1071: pop
/*     */     //   1072: aload #6
/*     */     //   1074: ldc_w -801837164
/*     */     //   1077: invokeinterface startReplaceGroup : (I)V
/*     */     //   1082: aload #6
/*     */     //   1084: ldc_w '*756@36778L2565'
/*     */     //   1087: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   1090: aload #13
/*     */     //   1092: aload_0
/*     */     //   1093: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   1096: invokevirtual containsKey : (Ljava/lang/Object;)Z
/*     */     //   1099: ifeq -> 1114
/*     */     //   1102: aload #13
/*     */     //   1104: aload_0
/*     */     //   1105: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   1108: invokevirtual containsKey : (Ljava/lang/Object;)Z
/*     */     //   1111: ifne -> 1211
/*     */     //   1114: aload #13
/*     */     //   1116: invokevirtual clear : ()V
/*     */     //   1119: aload #12
/*     */     //   1121: checkcast java/util/List
/*     */     //   1124: astore #14
/*     */     //   1126: iconst_0
/*     */     //   1127: istore #15
/*     */     //   1129: nop
/*     */     //   1130: iconst_0
/*     */     //   1131: istore #16
/*     */     //   1133: aload #14
/*     */     //   1135: invokeinterface size : ()I
/*     */     //   1140: istore #17
/*     */     //   1142: iload #16
/*     */     //   1144: iload #17
/*     */     //   1146: if_icmpge -> 1210
/*     */     //   1149: aload #14
/*     */     //   1151: iload #16
/*     */     //   1153: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1158: astore #18
/*     */     //   1160: aload #18
/*     */     //   1162: astore #19
/*     */     //   1164: iconst_0
/*     */     //   1165: istore #20
/*     */     //   1167: aload #13
/*     */     //   1169: aload #19
/*     */     //   1171: ldc_w 885640742
/*     */     //   1174: iconst_1
/*     */     //   1175: new androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1
/*     */     //   1178: dup
/*     */     //   1179: aload_0
/*     */     //   1180: aload #19
/*     */     //   1182: aload_2
/*     */     //   1183: aload #11
/*     */     //   1185: aload #12
/*     */     //   1187: aload #5
/*     */     //   1189: invokespecial <init> : (Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlin/jvm/functions/Function4;)V
/*     */     //   1192: aload #6
/*     */     //   1194: bipush #54
/*     */     //   1196: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1199: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   1202: nop
/*     */     //   1203: nop
/*     */     //   1204: iinc #16, 1
/*     */     //   1207: goto -> 1142
/*     */     //   1210: nop
/*     */     //   1211: aload #6
/*     */     //   1213: invokeinterface endReplaceGroup : ()V
/*     */     //   1218: aload_0
/*     */     //   1219: invokevirtual getSegment : ()Landroidx/compose/animation/core/Transition$Segment;
/*     */     //   1222: astore #15
/*     */     //   1224: aload #6
/*     */     //   1226: ldc_w -801749627
/*     */     //   1229: ldc 'CC(remember):AnimatedContent.kt#9igjgp'
/*     */     //   1231: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1234: aload #6
/*     */     //   1236: astore #17
/*     */     //   1238: aload #6
/*     */     //   1240: aload #11
/*     */     //   1242: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1247: aload #6
/*     */     //   1249: aload #15
/*     */     //   1251: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1256: ior
/*     */     //   1257: istore #18
/*     */     //   1259: iconst_0
/*     */     //   1260: istore #19
/*     */     //   1262: aload #17
/*     */     //   1264: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1269: astore #20
/*     */     //   1271: iconst_0
/*     */     //   1272: istore #21
/*     */     //   1274: iload #18
/*     */     //   1276: ifne -> 1290
/*     */     //   1279: aload #20
/*     */     //   1281: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1284: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1287: if_acmpne -> 1320
/*     */     //   1290: iconst_0
/*     */     //   1291: istore #22
/*     */     //   1293: aload_2
/*     */     //   1294: aload #11
/*     */     //   1296: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1301: checkcast androidx/compose/animation/ContentTransform
/*     */     //   1304: astore #23
/*     */     //   1306: aload #17
/*     */     //   1308: aload #23
/*     */     //   1310: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1315: aload #23
/*     */     //   1317: goto -> 1322
/*     */     //   1320: aload #20
/*     */     //   1322: nop
/*     */     //   1323: nop
/*     */     //   1324: nop
/*     */     //   1325: checkcast androidx/compose/animation/ContentTransform
/*     */     //   1328: astore #16
/*     */     //   1330: aload #6
/*     */     //   1332: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1335: aload #16
/*     */     //   1337: astore #14
/*     */     //   1339: aload #11
/*     */     //   1341: aload #14
/*     */     //   1343: aload #6
/*     */     //   1345: iconst_0
/*     */     //   1346: invokevirtual createSizeAnimationModifier$animation : (Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
/*     */     //   1349: astore #15
/*     */     //   1351: aload_1
/*     */     //   1352: aload #15
/*     */     //   1354: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1359: astore #16
/*     */     //   1361: aload #6
/*     */     //   1363: ldc_w -801736481
/*     */     //   1366: ldc 'CC(remember):AnimatedContent.kt#9igjgp'
/*     */     //   1368: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1371: aload #6
/*     */     //   1373: astore #19
/*     */     //   1375: iconst_0
/*     */     //   1376: istore #20
/*     */     //   1378: iconst_0
/*     */     //   1379: istore #21
/*     */     //   1381: aload #19
/*     */     //   1383: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1388: astore #22
/*     */     //   1390: iconst_0
/*     */     //   1391: istore #23
/*     */     //   1393: aload #22
/*     */     //   1395: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1398: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1401: if_acmpne -> 1432
/*     */     //   1404: iconst_0
/*     */     //   1405: istore #24
/*     */     //   1407: new androidx/compose/animation/AnimatedContentMeasurePolicy
/*     */     //   1410: dup
/*     */     //   1411: aload #11
/*     */     //   1413: invokespecial <init> : (Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V
/*     */     //   1416: astore #25
/*     */     //   1418: aload #19
/*     */     //   1420: aload #25
/*     */     //   1422: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1427: aload #25
/*     */     //   1429: goto -> 1434
/*     */     //   1432: aload #22
/*     */     //   1434: nop
/*     */     //   1435: nop
/*     */     //   1436: nop
/*     */     //   1437: checkcast androidx/compose/animation/AnimatedContentMeasurePolicy
/*     */     //   1440: astore #18
/*     */     //   1442: aload #6
/*     */     //   1444: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1447: aload #18
/*     */     //   1449: astore #17
/*     */     //   1451: sipush #384
/*     */     //   1454: istore #18
/*     */     //   1456: nop
/*     */     //   1457: iconst_0
/*     */     //   1458: istore #19
/*     */     //   1460: aload #6
/*     */     //   1462: ldc_w -1323940314
/*     */     //   1465: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1468: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1471: aload #6
/*     */     //   1473: iconst_0
/*     */     //   1474: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1477: istore #20
/*     */     //   1479: aload #6
/*     */     //   1481: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1486: astore #21
/*     */     //   1488: aload #6
/*     */     //   1490: aload #16
/*     */     //   1492: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1495: astore #22
/*     */     //   1497: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1500: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1503: astore #23
/*     */     //   1505: bipush #6
/*     */     //   1507: sipush #896
/*     */     //   1510: iload #18
/*     */     //   1512: bipush #6
/*     */     //   1514: ishl
/*     */     //   1515: iand
/*     */     //   1516: ior
/*     */     //   1517: istore #24
/*     */     //   1519: nop
/*     */     //   1520: iconst_0
/*     */     //   1521: istore #25
/*     */     //   1523: aload #6
/*     */     //   1525: ldc_w -692256719
/*     */     //   1528: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1531: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1534: aload #6
/*     */     //   1536: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1541: instanceof androidx/compose/runtime/Applier
/*     */     //   1544: ifne -> 1550
/*     */     //   1547: invokestatic invalidApplier : ()V
/*     */     //   1550: aload #6
/*     */     //   1552: invokeinterface startReusableNode : ()V
/*     */     //   1557: aload #6
/*     */     //   1559: invokeinterface getInserting : ()Z
/*     */     //   1564: ifeq -> 1579
/*     */     //   1567: aload #6
/*     */     //   1569: aload #23
/*     */     //   1571: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1576: goto -> 1586
/*     */     //   1579: aload #6
/*     */     //   1581: invokeinterface useNode : ()V
/*     */     //   1586: aload #6
/*     */     //   1588: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1591: astore #26
/*     */     //   1593: iconst_0
/*     */     //   1594: istore #27
/*     */     //   1596: aload #26
/*     */     //   1598: aload #17
/*     */     //   1600: checkcast androidx/compose/ui/layout/MeasurePolicy
/*     */     //   1603: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1606: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1609: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1612: aload #26
/*     */     //   1614: aload #21
/*     */     //   1616: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1619: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1622: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1625: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1628: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1631: astore #28
/*     */     //   1633: iconst_0
/*     */     //   1634: istore #29
/*     */     //   1636: aload #26
/*     */     //   1638: astore #30
/*     */     //   1640: iconst_0
/*     */     //   1641: istore #31
/*     */     //   1643: aload #30
/*     */     //   1645: invokeinterface getInserting : ()Z
/*     */     //   1650: ifne -> 1671
/*     */     //   1653: aload #30
/*     */     //   1655: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1660: iload #20
/*     */     //   1662: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1665: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1668: ifne -> 1697
/*     */     //   1671: aload #30
/*     */     //   1673: iload #20
/*     */     //   1675: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1678: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1683: aload #26
/*     */     //   1685: iload #20
/*     */     //   1687: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1690: aload #28
/*     */     //   1692: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1697: nop
/*     */     //   1698: nop
/*     */     //   1699: nop
/*     */     //   1700: aload #26
/*     */     //   1702: aload #22
/*     */     //   1704: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1707: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1710: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1713: nop
/*     */     //   1714: nop
/*     */     //   1715: aload #6
/*     */     //   1717: bipush #14
/*     */     //   1719: iload #24
/*     */     //   1721: bipush #6
/*     */     //   1723: ishr
/*     */     //   1724: iand
/*     */     //   1725: istore #32
/*     */     //   1727: astore #33
/*     */     //   1729: iconst_0
/*     */     //   1730: istore #34
/*     */     //   1732: aload #33
/*     */     //   1734: ldc_w 1023567688
/*     */     //   1737: ldc_w 'C:AnimatedContent.kt#xbi5r1'
/*     */     //   1740: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1743: aload #33
/*     */     //   1745: ldc_w -1491001814
/*     */     //   1748: invokeinterface startReplaceGroup : (I)V
/*     */     //   1753: aload #33
/*     */     //   1755: ldc_w ''
/*     */     //   1758: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   1761: aload #12
/*     */     //   1763: checkcast java/util/List
/*     */     //   1766: astore #35
/*     */     //   1768: iconst_0
/*     */     //   1769: istore #36
/*     */     //   1771: nop
/*     */     //   1772: iconst_0
/*     */     //   1773: istore #37
/*     */     //   1775: aload #35
/*     */     //   1777: invokeinterface size : ()I
/*     */     //   1782: istore #38
/*     */     //   1784: iload #37
/*     */     //   1786: iload #38
/*     */     //   1788: if_icmpge -> 1881
/*     */     //   1791: aload #35
/*     */     //   1793: iload #37
/*     */     //   1795: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1800: astore #39
/*     */     //   1802: aload #39
/*     */     //   1804: astore #40
/*     */     //   1806: iconst_0
/*     */     //   1807: istore #41
/*     */     //   1809: aload #33
/*     */     //   1811: ldc_w 1908315325
/*     */     //   1814: aload #4
/*     */     //   1816: aload #40
/*     */     //   1818: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1823: invokeinterface startMovableGroup : (ILjava/lang/Object;)V
/*     */     //   1828: aload #33
/*     */     //   1830: ldc_w '815@39722L8'
/*     */     //   1833: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   1836: aload #13
/*     */     //   1838: aload #40
/*     */     //   1840: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1843: checkcast kotlin/jvm/functions/Function2
/*     */     //   1846: dup
/*     */     //   1847: ifnonnull -> 1854
/*     */     //   1850: pop
/*     */     //   1851: goto -> 1866
/*     */     //   1854: aload #33
/*     */     //   1856: iconst_0
/*     */     //   1857: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1860: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1865: pop
/*     */     //   1866: aload #33
/*     */     //   1868: invokeinterface endMovableGroup : ()V
/*     */     //   1873: nop
/*     */     //   1874: nop
/*     */     //   1875: iinc #37, 1
/*     */     //   1878: goto -> 1784
/*     */     //   1881: nop
/*     */     //   1882: aload #33
/*     */     //   1884: invokeinterface endReplaceGroup : ()V
/*     */     //   1889: aload #33
/*     */     //   1891: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1894: nop
/*     */     //   1895: aload #6
/*     */     //   1897: invokeinterface endNode : ()V
/*     */     //   1902: aload #6
/*     */     //   1904: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1907: nop
/*     */     //   1908: aload #6
/*     */     //   1910: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1913: nop
/*     */     //   1914: invokestatic isTraceInProgress : ()Z
/*     */     //   1917: ifeq -> 1933
/*     */     //   1920: invokestatic traceEventEnd : ()V
/*     */     //   1923: goto -> 1933
/*     */     //   1926: aload #6
/*     */     //   1928: invokeinterface skipToGroupEnd : ()V
/*     */     //   1933: aload #6
/*     */     //   1935: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1940: dup
/*     */     //   1941: ifnull -> 1974
/*     */     //   1944: new androidx/compose/animation/AnimatedContentKt$AnimatedContent$9
/*     */     //   1947: dup
/*     */     //   1948: aload_0
/*     */     //   1949: aload_1
/*     */     //   1950: aload_2
/*     */     //   1951: aload_3
/*     */     //   1952: aload #4
/*     */     //   1954: aload #5
/*     */     //   1956: iload #7
/*     */     //   1958: iload #8
/*     */     //   1960: invokespecial <init> : (Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;II)V
/*     */     //   1963: checkcast kotlin/jvm/functions/Function2
/*     */     //   1966: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1971: goto -> 1975
/*     */     //   1974: pop
/*     */     //   1975: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #714	-> 13
/*     */     //   #705	-> 365
/*     */     //   #706	-> 379
/*     */     //   #711	-> 393
/*     */     //   #712	-> 408
/*     */     //   #714	-> 429
/*     */     //   #715	-> 432
/*     */     //   #900	-> 452
/*     */     //   #715	-> 473
/*     */     //   #716	-> 484
/*     */     //   #901	-> 510
/*     */     //   #902	-> 522
/*     */     //   #903	-> 538
/*     */     //   #717	-> 541
/*     */     //   #903	-> 552
/*     */     //   #904	-> 554
/*     */     //   #905	-> 563
/*     */     //   #906	-> 568
/*     */     //   #902	-> 570
/*     */     //   #901	-> 571
/*     */     //   #901	-> 572
/*     */     //   #716	-> 573
/*     */     //   #720	-> 594
/*     */     //   #907	-> 620
/*     */     //   #908	-> 632
/*     */     //   #909	-> 648
/*     */     //   #720	-> 651
/*     */     //   #909	-> 670
/*     */     //   #910	-> 672
/*     */     //   #911	-> 681
/*     */     //   #912	-> 686
/*     */     //   #908	-> 688
/*     */     //   #907	-> 689
/*     */     //   #907	-> 690
/*     */     //   #720	-> 691
/*     */     //   #721	-> 712
/*     */     //   #913	-> 738
/*     */     //   #914	-> 750
/*     */     //   #915	-> 766
/*     */     //   #721	-> 769
/*     */     //   #915	-> 772
/*     */     //   #916	-> 774
/*     */     //   #917	-> 783
/*     */     //   #918	-> 788
/*     */     //   #914	-> 790
/*     */     //   #913	-> 791
/*     */     //   #913	-> 792
/*     */     //   #721	-> 793
/*     */     //   #725	-> 807
/*     */     //   #726	-> 819
/*     */     //   #727	-> 824
/*     */     //   #729	-> 834
/*     */     //   #730	-> 848
/*     */     //   #731	-> 873
/*     */     //   #732	-> 878
/*     */     //   #734	-> 888
/*     */     //   #735	-> 909
/*     */     //   #738	-> 914
/*     */     //   #739	-> 920
/*     */     //   #745	-> 927
/*     */     //   #747	-> 953
/*     */     //   #919	-> 963
/*     */     //   #920	-> 966
/*     */     //   #921	-> 994
/*     */     //   #747	-> 1001
/*     */     //   #921	-> 1024
/*     */     //   #922	-> 1027
/*     */     //   #923	-> 1032
/*     */     //   #925	-> 1038
/*     */     //   #747	-> 1039
/*     */     //   #748	-> 1041
/*     */     //   #749	-> 1047
/*     */     //   #751	-> 1060
/*     */     //   #754	-> 1090
/*     */     //   #755	-> 1114
/*     */     //   #756	-> 1119
/*     */     //   #926	-> 1129
/*     */     //   #927	-> 1130
/*     */     //   #928	-> 1149
/*     */     //   #929	-> 1160
/*     */     //   #757	-> 1167
/*     */     //   #807	-> 1202
/*     */     //   #929	-> 1203
/*     */     //   #927	-> 1204
/*     */     //   #931	-> 1210
/*     */     //   #809	-> 1218
/*     */     //   #932	-> 1262
/*     */     //   #933	-> 1274
/*     */     //   #934	-> 1290
/*     */     //   #809	-> 1293
/*     */     //   #934	-> 1304
/*     */     //   #935	-> 1306
/*     */     //   #936	-> 1315
/*     */     //   #937	-> 1320
/*     */     //   #933	-> 1322
/*     */     //   #932	-> 1323
/*     */     //   #932	-> 1324
/*     */     //   #809	-> 1325
/*     */     //   #810	-> 1339
/*     */     //   #812	-> 1351
/*     */     //   #820	-> 1368
/*     */     //   #938	-> 1381
/*     */     //   #939	-> 1393
/*     */     //   #940	-> 1404
/*     */     //   #820	-> 1407
/*     */     //   #940	-> 1416
/*     */     //   #941	-> 1418
/*     */     //   #942	-> 1427
/*     */     //   #943	-> 1432
/*     */     //   #939	-> 1434
/*     */     //   #938	-> 1435
/*     */     //   #938	-> 1436
/*     */     //   #820	-> 1437
/*     */     //   #811	-> 1456
/*     */     //   #944	-> 1468
/*     */     //   #945	-> 1474
/*     */     //   #946	-> 1481
/*     */     //   #947	-> 1490
/*     */     //   #949	-> 1497
/*     */     //   #948	-> 1519
/*     */     //   #950	-> 1531
/*     */     //   #951	-> 1534
/*     */     //   #952	-> 1552
/*     */     //   #953	-> 1557
/*     */     //   #954	-> 1569
/*     */     //   #956	-> 1581
/*     */     //   #958	-> 1586
/*     */     //   #959	-> 1596
/*     */     //   #960	-> 1612
/*     */     //   #962	-> 1625
/*     */     //   #963	-> 1636
/*     */     //   #964	-> 1643
/*     */     //   #965	-> 1671
/*     */     //   #966	-> 1683
/*     */     //   #968	-> 1697
/*     */     //   #963	-> 1698
/*     */     //   #968	-> 1699
/*     */     //   #969	-> 1700
/*     */     //   #970	-> 1713
/*     */     //   #958	-> 1714
/*     */     //   #971	-> 1715
/*     */     //   #814	-> 1740
/*     */     //   #972	-> 1771
/*     */     //   #973	-> 1772
/*     */     //   #974	-> 1791
/*     */     //   #975	-> 1802
/*     */     //   #815	-> 1814
/*     */     //   #816	-> 1836
/*     */     //   #818	-> 1873
/*     */     //   #975	-> 1874
/*     */     //   #973	-> 1875
/*     */     //   #977	-> 1881
/*     */     //   #814	-> 1891
/*     */     //   #819	-> 1894
/*     */     //   #971	-> 1895
/*     */     //   #978	-> 1897
/*     */     //   #950	-> 1904
/*     */     //   #979	-> 1907
/*     */     //   #944	-> 1910
/*     */     //   #980	-> 1913
/*     */     //   #822	-> 1926
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   446	27	13	$i$f$getCurrent	I
/*     */     //   443	30	11	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   443	30	12	$changed$iv	I
/*     */     //   541	11	18	$i$a$-cache-AnimatedContentKt$AnimatedContent$rootScope$1	I
/*     */     //   554	11	19	value$iv	Ljava/lang/Object;
/*     */     //   522	49	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   519	52	16	it$iv	Ljava/lang/Object;
/*     */     //   510	63	15	$i$f$cache	I
/*     */     //   507	66	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   507	66	14	invalid$iv	Z
/*     */     //   651	19	19	$i$a$-cache-AnimatedContentKt$AnimatedContent$currentlyVisible$1	I
/*     */     //   672	11	21	value$iv	Ljava/lang/Object;
/*     */     //   632	57	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   629	60	17	it$iv	Ljava/lang/Object;
/*     */     //   620	71	16	$i$f$cache	I
/*     */     //   617	74	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   617	74	15	invalid$iv	Z
/*     */     //   769	3	20	$i$a$-cache-AnimatedContentKt$AnimatedContent$contentMap$1	I
/*     */     //   774	11	20	value$iv	Ljava/lang/Object;
/*     */     //   750	41	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   747	44	18	it$iv	Ljava/lang/Object;
/*     */     //   738	55	17	$i$f$cache	I
/*     */     //   735	58	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   735	58	16	invalid$iv	Z
/*     */     //   1001	23	21	$i$a$-indexOfFirst-AnimatedContentKt$AnimatedContent$id$1	I
/*     */     //   998	26	20	it	Ljava/lang/Object;
/*     */     //   994	41	19	item$iv	Ljava/lang/Object;
/*     */     //   963	76	16	$i$f$indexOfFirst	I
/*     */     //   966	73	17	index$iv	I
/*     */     //   960	79	15	$this$indexOfFirst$iv	Ljava/util/List;
/*     */     //   1041	31	14	id	I
/*     */     //   1167	36	20	$i$a$-fastForEach-AnimatedContentKt$AnimatedContent$6	I
/*     */     //   1164	39	19	stateForContent	Ljava/lang/Object;
/*     */     //   1160	44	18	item$iv	Ljava/lang/Object;
/*     */     //   1133	77	16	index$iv	I
/*     */     //   1129	82	15	$i$f$fastForEach	I
/*     */     //   1126	85	14	$this$fastForEach$iv	Ljava/util/List;
/*     */     //   1293	11	22	$i$a$-cache-AnimatedContentKt$AnimatedContent$contentTransform$1	I
/*     */     //   1306	11	23	value$iv	Ljava/lang/Object;
/*     */     //   1274	49	21	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1271	52	20	it$iv	Ljava/lang/Object;
/*     */     //   1262	63	19	$i$f$cache	I
/*     */     //   1259	66	17	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1259	66	18	invalid$iv	Z
/*     */     //   1407	9	24	$i$a$-cache-AnimatedContentKt$AnimatedContent$7	I
/*     */     //   1418	11	25	value$iv	Ljava/lang/Object;
/*     */     //   1393	42	23	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1390	45	22	it$iv	Ljava/lang/Object;
/*     */     //   1381	56	21	$i$f$cache	I
/*     */     //   1378	59	19	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1378	59	20	invalid$iv	Z
/*     */     //   1809	65	41	$i$a$-fastForEach-AnimatedContentKt$AnimatedContent$8$1	I
/*     */     //   1806	68	40	it	Ljava/lang/Object;
/*     */     //   1802	73	39	item$iv	Ljava/lang/Object;
/*     */     //   1775	106	37	index$iv	I
/*     */     //   1771	111	36	$i$f$fastForEach	I
/*     */     //   1768	114	35	$this$fastForEach$iv	Ljava/util/List;
/*     */     //   1732	163	34	$i$a$-Layout-AnimatedContentKt$AnimatedContent$8	I
/*     */     //   1729	166	33	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1729	166	32	$changed	I
/*     */     //   1643	55	31	$i$a$-with-Updater$set$1$iv$iv	I
/*     */     //   1640	58	30	$this$set_impl_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1636	64	29	$i$f$set-impl	I
/*     */     //   1633	67	28	block$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1596	118	27	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv	I
/*     */     //   1593	121	26	$this$Layout_u24lambda_u240$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1523	385	25	$i$f$ReusableComposeNode	I
/*     */     //   1520	388	23	factory$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1520	388	24	$changed$iv$iv	I
/*     */     //   1460	454	19	$i$f$Layout	I
/*     */     //   1479	435	20	compositeKeyHash$iv	I
/*     */     //   1488	426	21	localMap$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1497	417	22	materialized$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1457	457	18	$changed$iv	I
/*     */     //   478	1445	10	layoutDirection	Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   587	1336	11	rootScope	Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;
/*     */     //   705	1218	12	currentlyVisible	Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*     */     //   807	1116	13	contentMap	Landroidx/collection/MutableScatterMap;
/*     */     //   1339	584	14	contentTransform	Landroidx/compose/animation/ContentTransform;
/*     */     //   1351	572	15	sizeModifier	Landroidx/compose/ui/Modifier;
/*     */     //   35	1941	9	$dirty	I
/*     */     //   0	1976	0	$this$AnimatedContent	Landroidx/compose/animation/core/Transition;
/*     */     //   0	1976	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1976	2	transitionSpec	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1976	3	contentAlignment	Landroidx/compose/ui/Alignment;
/*     */     //   0	1976	4	contentKey	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1976	5	content	Lkotlin/jvm/functions/Function4;
/*     */     //   0	1976	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1976	7	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\003\020\000\032\0020\001\"\004\b\000\020\002H\013¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "S", "invoke", "(Landroidx/compose/runtime/Composer;I)V"})
/*     */   @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n1225#2,6:900\n1225#2,6:906\n1225#2,6:912\n1225#2,6:918\n1225#2,6:925\n1225#2,6:931\n1#3:924\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1\n*L\n758#1:900,6\n762#1:906,6\n769#1:912,6\n780#1:918,6\n776#1:925,6\n787#1:931,6\n*E\n"})
/*     */   static final class AnimatedContentKt$AnimatedContent$6$1 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(@Nullable Composer $composer, int $changed) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'C757@36814L38,761@37028L323,768@37384L125,779@37953L328,775@37761L25,786@38417L233,791@38669L660,773@37692L1637:AnimatedContent.kt#xbi5r1'
/*     */       //   3: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */       //   6: iload_2
/*     */       //   7: iconst_3
/*     */       //   8: iand
/*     */       //   9: iconst_2
/*     */       //   10: if_icmpne -> 22
/*     */       //   13: aload_1
/*     */       //   14: invokeinterface getSkipping : ()Z
/*     */       //   19: ifne -> 892
/*     */       //   22: invokestatic isTraceInProgress : ()Z
/*     */       //   25: ifeq -> 37
/*     */       //   28: ldc 885640742
/*     */       //   30: iload_2
/*     */       //   31: iconst_m1
/*     */       //   32: ldc 'androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:757)'
/*     */       //   34: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   37: aload_1
/*     */       //   38: ldc 1908224079
/*     */       //   40: ldc 'CC(remember):AnimatedContent.kt#9igjgp'
/*     */       //   42: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   45: aload_1
/*     */       //   46: astore #5
/*     */       //   48: iconst_0
/*     */       //   49: istore #6
/*     */       //   51: aload_0
/*     */       //   52: getfield $transitionSpec : Lkotlin/jvm/functions/Function1;
/*     */       //   55: astore #7
/*     */       //   57: aload_0
/*     */       //   58: getfield $rootScope : Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;
/*     */       //   61: astore #8
/*     */       //   63: iconst_0
/*     */       //   64: istore #9
/*     */       //   66: aload #5
/*     */       //   68: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   73: astore #10
/*     */       //   75: iconst_0
/*     */       //   76: istore #11
/*     */       //   78: aload #10
/*     */       //   80: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   83: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   86: if_acmpne -> 120
/*     */       //   89: iconst_0
/*     */       //   90: istore #12
/*     */       //   92: aload #7
/*     */       //   94: aload #8
/*     */       //   96: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   101: checkcast androidx/compose/animation/ContentTransform
/*     */       //   104: astore #13
/*     */       //   106: aload #5
/*     */       //   108: aload #13
/*     */       //   110: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   115: aload #13
/*     */       //   117: goto -> 122
/*     */       //   120: aload #10
/*     */       //   122: nop
/*     */       //   123: nop
/*     */       //   124: nop
/*     */       //   125: checkcast androidx/compose/animation/ContentTransform
/*     */       //   128: astore #4
/*     */       //   130: aload_1
/*     */       //   131: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   134: aload #4
/*     */       //   136: astore_3
/*     */       //   137: aload_0
/*     */       //   138: getfield $this_AnimatedContent : Landroidx/compose/animation/core/Transition;
/*     */       //   141: invokevirtual getSegment : ()Landroidx/compose/animation/core/Transition$Segment;
/*     */       //   144: invokeinterface getTargetState : ()Ljava/lang/Object;
/*     */       //   149: aload_0
/*     */       //   150: getfield $stateForContent : Ljava/lang/Object;
/*     */       //   153: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   156: istore #5
/*     */       //   158: aload_1
/*     */       //   159: ldc 1908231212
/*     */       //   161: ldc 'CC(remember):AnimatedContent.kt#9igjgp'
/*     */       //   163: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   166: aload_1
/*     */       //   167: astore #7
/*     */       //   169: aload_1
/*     */       //   170: iload #5
/*     */       //   172: invokeinterface changed : (Z)Z
/*     */       //   177: istore #8
/*     */       //   179: aload_0
/*     */       //   180: getfield $this_AnimatedContent : Landroidx/compose/animation/core/Transition;
/*     */       //   183: astore #9
/*     */       //   185: aload_0
/*     */       //   186: getfield $stateForContent : Ljava/lang/Object;
/*     */       //   189: astore #10
/*     */       //   191: aload_0
/*     */       //   192: getfield $transitionSpec : Lkotlin/jvm/functions/Function1;
/*     */       //   195: astore #11
/*     */       //   197: aload_0
/*     */       //   198: getfield $rootScope : Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;
/*     */       //   201: astore #12
/*     */       //   203: iconst_0
/*     */       //   204: istore #13
/*     */       //   206: aload #7
/*     */       //   208: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   213: astore #14
/*     */       //   215: iconst_0
/*     */       //   216: istore #15
/*     */       //   218: iload #8
/*     */       //   220: ifne -> 234
/*     */       //   223: aload #14
/*     */       //   225: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   228: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   231: if_acmpne -> 296
/*     */       //   234: iconst_0
/*     */       //   235: istore #16
/*     */       //   237: aload #9
/*     */       //   239: invokevirtual getSegment : ()Landroidx/compose/animation/core/Transition$Segment;
/*     */       //   242: invokeinterface getTargetState : ()Ljava/lang/Object;
/*     */       //   247: aload #10
/*     */       //   249: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   252: ifeq -> 264
/*     */       //   255: getstatic androidx/compose/animation/ExitTransition.Companion : Landroidx/compose/animation/ExitTransition$Companion;
/*     */       //   258: invokevirtual getNone : ()Landroidx/compose/animation/ExitTransition;
/*     */       //   261: goto -> 279
/*     */       //   264: aload #11
/*     */       //   266: aload #12
/*     */       //   268: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   273: checkcast androidx/compose/animation/ContentTransform
/*     */       //   276: invokevirtual getInitialContentExit : ()Landroidx/compose/animation/ExitTransition;
/*     */       //   279: nop
/*     */       //   280: astore #17
/*     */       //   282: aload #7
/*     */       //   284: aload #17
/*     */       //   286: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   291: aload #17
/*     */       //   293: goto -> 298
/*     */       //   296: aload #14
/*     */       //   298: nop
/*     */       //   299: nop
/*     */       //   300: nop
/*     */       //   301: checkcast androidx/compose/animation/ExitTransition
/*     */       //   304: astore #6
/*     */       //   306: aload_1
/*     */       //   307: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   310: aload #6
/*     */       //   312: astore #4
/*     */       //   314: aload_1
/*     */       //   315: ldc 1908242406
/*     */       //   317: ldc 'CC(remember):AnimatedContent.kt#9igjgp'
/*     */       //   319: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   322: aload_1
/*     */       //   323: astore #7
/*     */       //   325: iconst_0
/*     */       //   326: istore #8
/*     */       //   328: aload_0
/*     */       //   329: getfield $stateForContent : Ljava/lang/Object;
/*     */       //   332: astore #9
/*     */       //   334: aload_0
/*     */       //   335: getfield $this_AnimatedContent : Landroidx/compose/animation/core/Transition;
/*     */       //   338: astore #10
/*     */       //   340: iconst_0
/*     */       //   341: istore #11
/*     */       //   343: aload #7
/*     */       //   345: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   350: astore #12
/*     */       //   352: iconst_0
/*     */       //   353: istore #13
/*     */       //   355: aload #12
/*     */       //   357: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   360: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   363: if_acmpne -> 402
/*     */       //   366: iconst_0
/*     */       //   367: istore #14
/*     */       //   369: new androidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData
/*     */       //   372: dup
/*     */       //   373: aload #9
/*     */       //   375: aload #10
/*     */       //   377: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */       //   380: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   383: invokespecial <init> : (Z)V
/*     */       //   386: astore #15
/*     */       //   388: aload #7
/*     */       //   390: aload #15
/*     */       //   392: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   397: aload #15
/*     */       //   399: goto -> 404
/*     */       //   402: aload #12
/*     */       //   404: nop
/*     */       //   405: nop
/*     */       //   406: nop
/*     */       //   407: checkcast androidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData
/*     */       //   410: astore #6
/*     */       //   412: aload_1
/*     */       //   413: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   416: aload #6
/*     */       //   418: astore #5
/*     */       //   420: aload_3
/*     */       //   421: invokevirtual getTargetContentEnter : ()Landroidx/compose/animation/EnterTransition;
/*     */       //   424: astore #6
/*     */       //   426: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   429: checkcast androidx/compose/ui/Modifier
/*     */       //   432: aload_1
/*     */       //   433: ldc 1908260817
/*     */       //   435: ldc 'CC(remember):AnimatedContent.kt#9igjgp'
/*     */       //   437: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   440: aload_1
/*     */       //   441: astore #9
/*     */       //   443: aload_1
/*     */       //   444: aload_3
/*     */       //   445: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   450: istore #10
/*     */       //   452: iconst_0
/*     */       //   453: istore #11
/*     */       //   455: aload #9
/*     */       //   457: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   462: astore #12
/*     */       //   464: iconst_0
/*     */       //   465: istore #13
/*     */       //   467: iload #10
/*     */       //   469: ifne -> 483
/*     */       //   472: aload #12
/*     */       //   474: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   477: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   480: if_acmpne -> 518
/*     */       //   483: astore #18
/*     */       //   485: iconst_0
/*     */       //   486: istore #14
/*     */       //   488: new androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$1$1
/*     */       //   491: dup
/*     */       //   492: aload_3
/*     */       //   493: invokespecial <init> : (Landroidx/compose/animation/ContentTransform;)V
/*     */       //   496: checkcast kotlin/jvm/functions/Function3
/*     */       //   499: aload #18
/*     */       //   501: swap
/*     */       //   502: astore #15
/*     */       //   504: aload #9
/*     */       //   506: aload #15
/*     */       //   508: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   513: aload #15
/*     */       //   515: goto -> 520
/*     */       //   518: aload #12
/*     */       //   520: nop
/*     */       //   521: nop
/*     */       //   522: nop
/*     */       //   523: checkcast kotlin/jvm/functions/Function3
/*     */       //   526: astore #8
/*     */       //   528: aload_1
/*     */       //   529: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   532: aload #8
/*     */       //   534: invokestatic layout : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;
/*     */       //   537: aload #5
/*     */       //   539: astore #8
/*     */       //   541: aload_0
/*     */       //   542: getfield $stateForContent : Ljava/lang/Object;
/*     */       //   545: astore #9
/*     */       //   547: aload_0
/*     */       //   548: getfield $this_AnimatedContent : Landroidx/compose/animation/core/Transition;
/*     */       //   551: astore #10
/*     */       //   553: aload #8
/*     */       //   555: astore #11
/*     */       //   557: astore #18
/*     */       //   559: iconst_0
/*     */       //   560: istore #12
/*     */       //   562: aload #11
/*     */       //   564: aload #9
/*     */       //   566: aload #10
/*     */       //   568: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */       //   571: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   574: invokevirtual setTarget : (Z)V
/*     */       //   577: aload #18
/*     */       //   579: aload #8
/*     */       //   581: checkcast androidx/compose/ui/Modifier
/*     */       //   584: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   589: astore #7
/*     */       //   591: aload_0
/*     */       //   592: getfield $this_AnimatedContent : Landroidx/compose/animation/core/Transition;
/*     */       //   595: aload_1
/*     */       //   596: ldc 1908254370
/*     */       //   598: ldc 'CC(remember):AnimatedContent.kt#9igjgp'
/*     */       //   600: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   603: aload_1
/*     */       //   604: astore #9
/*     */       //   606: aload_1
/*     */       //   607: aload_0
/*     */       //   608: getfield $stateForContent : Ljava/lang/Object;
/*     */       //   611: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   616: istore #10
/*     */       //   618: aload_0
/*     */       //   619: getfield $stateForContent : Ljava/lang/Object;
/*     */       //   622: astore #11
/*     */       //   624: iconst_0
/*     */       //   625: istore #12
/*     */       //   627: aload #9
/*     */       //   629: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   634: astore #13
/*     */       //   636: iconst_0
/*     */       //   637: istore #14
/*     */       //   639: iload #10
/*     */       //   641: ifne -> 655
/*     */       //   644: aload #13
/*     */       //   646: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   649: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   652: if_acmpne -> 691
/*     */       //   655: astore #18
/*     */       //   657: iconst_0
/*     */       //   658: istore #15
/*     */       //   660: new androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$3$1
/*     */       //   663: dup
/*     */       //   664: aload #11
/*     */       //   666: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   669: checkcast kotlin/jvm/functions/Function1
/*     */       //   672: aload #18
/*     */       //   674: swap
/*     */       //   675: astore #16
/*     */       //   677: aload #9
/*     */       //   679: aload #16
/*     */       //   681: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   686: aload #16
/*     */       //   688: goto -> 693
/*     */       //   691: aload #13
/*     */       //   693: nop
/*     */       //   694: nop
/*     */       //   695: nop
/*     */       //   696: checkcast kotlin/jvm/functions/Function1
/*     */       //   699: astore #8
/*     */       //   701: aload_1
/*     */       //   702: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   705: aload #8
/*     */       //   707: aload #7
/*     */       //   709: aload #6
/*     */       //   711: aload #4
/*     */       //   713: aload_1
/*     */       //   714: ldc 1908275570
/*     */       //   716: ldc 'CC(remember):AnimatedContent.kt#9igjgp'
/*     */       //   718: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   721: aload_1
/*     */       //   722: astore #9
/*     */       //   724: aload_1
/*     */       //   725: aload #4
/*     */       //   727: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   732: istore #10
/*     */       //   734: iconst_0
/*     */       //   735: istore #11
/*     */       //   737: aload #9
/*     */       //   739: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   744: astore #12
/*     */       //   746: iconst_0
/*     */       //   747: istore #13
/*     */       //   749: iload #10
/*     */       //   751: ifne -> 765
/*     */       //   754: aload #12
/*     */       //   756: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   759: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   762: if_acmpne -> 820
/*     */       //   765: astore #22
/*     */       //   767: astore #21
/*     */       //   769: astore #20
/*     */       //   771: astore #19
/*     */       //   773: astore #18
/*     */       //   775: iconst_0
/*     */       //   776: istore #14
/*     */       //   778: new androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$4$1
/*     */       //   781: dup
/*     */       //   782: aload #4
/*     */       //   784: invokespecial <init> : (Landroidx/compose/animation/ExitTransition;)V
/*     */       //   787: checkcast kotlin/jvm/functions/Function2
/*     */       //   790: astore #23
/*     */       //   792: aload #18
/*     */       //   794: aload #19
/*     */       //   796: aload #20
/*     */       //   798: aload #21
/*     */       //   800: aload #22
/*     */       //   802: aload #23
/*     */       //   804: astore #15
/*     */       //   806: aload #9
/*     */       //   808: aload #15
/*     */       //   810: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   815: aload #15
/*     */       //   817: goto -> 822
/*     */       //   820: aload #12
/*     */       //   822: nop
/*     */       //   823: nop
/*     */       //   824: nop
/*     */       //   825: checkcast kotlin/jvm/functions/Function2
/*     */       //   828: astore #8
/*     */       //   830: aload_1
/*     */       //   831: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   834: aload #8
/*     */       //   836: aconst_null
/*     */       //   837: ldc -616195562
/*     */       //   839: iconst_1
/*     */       //   840: new androidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1$5
/*     */       //   843: dup
/*     */       //   844: aload_0
/*     */       //   845: getfield $currentlyVisible : Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*     */       //   848: aload_0
/*     */       //   849: getfield $stateForContent : Ljava/lang/Object;
/*     */       //   852: aload_0
/*     */       //   853: getfield $rootScope : Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;
/*     */       //   856: aload_0
/*     */       //   857: getfield $content : Lkotlin/jvm/functions/Function4;
/*     */       //   860: invokespecial <init> : (Landroidx/compose/runtime/snapshots/SnapshotStateList;Ljava/lang/Object;Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;Lkotlin/jvm/functions/Function4;)V
/*     */       //   863: aload_1
/*     */       //   864: bipush #54
/*     */       //   866: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */       //   869: checkcast kotlin/jvm/functions/Function3
/*     */       //   872: aload_1
/*     */       //   873: ldc 12582912
/*     */       //   875: bipush #64
/*     */       //   877: invokestatic AnimatedEnterExitImpl : (Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function2;Landroidx/compose/animation/OnLookaheadMeasured;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */       //   880: invokestatic isTraceInProgress : ()Z
/*     */       //   883: ifeq -> 898
/*     */       //   886: invokestatic traceEventEnd : ()V
/*     */       //   889: goto -> 898
/*     */       //   892: aload_1
/*     */       //   893: invokeinterface skipToGroupEnd : ()V
/*     */       //   898: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #758	-> 6
/*     */       //   #900	-> 66
/*     */       //   #901	-> 78
/*     */       //   #902	-> 89
/*     */       //   #758	-> 92
/*     */       //   #902	-> 104
/*     */       //   #903	-> 106
/*     */       //   #904	-> 115
/*     */       //   #905	-> 120
/*     */       //   #901	-> 122
/*     */       //   #900	-> 123
/*     */       //   #900	-> 124
/*     */       //   #758	-> 125
/*     */       //   #762	-> 137
/*     */       //   #906	-> 206
/*     */       //   #907	-> 218
/*     */       //   #908	-> 234
/*     */       //   #763	-> 237
/*     */       //   #764	-> 255
/*     */       //   #766	-> 264
/*     */       //   #763	-> 279
/*     */       //   #908	-> 280
/*     */       //   #909	-> 282
/*     */       //   #910	-> 291
/*     */       //   #911	-> 296
/*     */       //   #907	-> 298
/*     */       //   #906	-> 299
/*     */       //   #906	-> 300
/*     */       //   #762	-> 301
/*     */       //   #761	-> 312
/*     */       //   #769	-> 319
/*     */       //   #912	-> 343
/*     */       //   #913	-> 355
/*     */       //   #914	-> 366
/*     */       //   #770	-> 369
/*     */       //   #914	-> 386
/*     */       //   #915	-> 388
/*     */       //   #916	-> 397
/*     */       //   #917	-> 402
/*     */       //   #913	-> 404
/*     */       //   #912	-> 405
/*     */       //   #912	-> 406
/*     */       //   #769	-> 407
/*     */       //   #777	-> 420
/*     */       //   #779	-> 426
/*     */       //   #780	-> 437
/*     */       //   #918	-> 455
/*     */       //   #919	-> 467
/*     */       //   #920	-> 483
/*     */       //   #780	-> 488
/*     */       //   #920	-> 502
/*     */       //   #921	-> 504
/*     */       //   #922	-> 513
/*     */       //   #923	-> 518
/*     */       //   #919	-> 520
/*     */       //   #918	-> 521
/*     */       //   #918	-> 522
/*     */       //   #780	-> 523
/*     */       //   #786	-> 537
/*     */       //   #924	-> 557
/*     */       //   #786	-> 562
/*     */       //   #786	-> 579
/*     */       //   #786	-> 584
/*     */       //   #775	-> 591
/*     */       //   #776	-> 600
/*     */       //   #925	-> 627
/*     */       //   #926	-> 639
/*     */       //   #927	-> 655
/*     */       //   #776	-> 660
/*     */       //   #927	-> 675
/*     */       //   #928	-> 677
/*     */       //   #929	-> 686
/*     */       //   #930	-> 691
/*     */       //   #926	-> 693
/*     */       //   #925	-> 694
/*     */       //   #925	-> 695
/*     */       //   #776	-> 696
/*     */       //   #786	-> 707
/*     */       //   #777	-> 709
/*     */       //   #778	-> 711
/*     */       //   #787	-> 718
/*     */       //   #931	-> 737
/*     */       //   #932	-> 749
/*     */       //   #933	-> 765
/*     */       //   #787	-> 778
/*     */       //   #933	-> 804
/*     */       //   #934	-> 806
/*     */       //   #935	-> 815
/*     */       //   #936	-> 820
/*     */       //   #932	-> 822
/*     */       //   #931	-> 823
/*     */       //   #931	-> 824
/*     */       //   #787	-> 825
/*     */       //   #792	-> 837
/*     */       //   #774	-> 877
/*     */       //   #805	-> 892
/*     */       //   #806	-> 898
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   92	12	12	$i$a$-cache-AnimatedContentKt$AnimatedContent$6$1$specOnEnter$1	I
/*     */       //   106	11	13	value$iv	Ljava/lang/Object;
/*     */       //   78	45	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   75	48	10	it$iv	Ljava/lang/Object;
/*     */       //   66	59	9	$i$f$cache	I
/*     */       //   63	62	5	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   63	62	6	invalid$iv	Z
/*     */       //   237	43	16	$i$a$-cache-AnimatedContentKt$AnimatedContent$6$1$exit$1	I
/*     */       //   282	11	17	value$iv	Ljava/lang/Object;
/*     */       //   218	81	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   215	84	14	it$iv	Ljava/lang/Object;
/*     */       //   206	95	13	$i$f$cache	I
/*     */       //   203	98	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   203	98	8	invalid$iv	Z
/*     */       //   369	17	14	$i$a$-cache-AnimatedContentKt$AnimatedContent$6$1$childData$1	I
/*     */       //   388	11	15	value$iv	Ljava/lang/Object;
/*     */       //   355	50	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   352	53	12	it$iv	Ljava/lang/Object;
/*     */       //   343	64	11	$i$f$cache	I
/*     */       //   340	67	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   340	67	8	invalid$iv	Z
/*     */       //   488	11	14	$i$a$-cache-AnimatedContentKt$AnimatedContent$6$1$1	I
/*     */       //   504	11	15	value$iv	Ljava/lang/Object;
/*     */       //   467	54	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   464	57	12	it$iv	Ljava/lang/Object;
/*     */       //   455	68	11	$i$f$cache	I
/*     */       //   452	71	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   452	71	10	invalid$iv	Z
/*     */       //   562	15	12	$i$a$-apply-AnimatedContentKt$AnimatedContent$6$1$2	I
/*     */       //   559	18	11	$this$invoke_u24lambda_u244	Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;
/*     */       //   660	12	15	$i$a$-cache-AnimatedContentKt$AnimatedContent$6$1$3	I
/*     */       //   677	11	16	value$iv	Ljava/lang/Object;
/*     */       //   639	55	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   636	58	13	it$iv	Ljava/lang/Object;
/*     */       //   627	69	12	$i$f$cache	I
/*     */       //   624	72	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   624	72	10	invalid$iv	Z
/*     */       //   778	12	14	$i$a$-cache-AnimatedContentKt$AnimatedContent$6$1$4	I
/*     */       //   806	11	15	value$iv	Ljava/lang/Object;
/*     */       //   749	74	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   746	77	12	it$iv	Ljava/lang/Object;
/*     */       //   737	88	11	$i$f$cache	I
/*     */       //   734	91	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   734	91	10	invalid$iv	Z
/*     */       //   137	752	3	specOnEnter	Landroidx/compose/animation/ContentTransform;
/*     */       //   314	575	4	exit	Landroidx/compose/animation/ExitTransition;
/*     */       //   420	469	5	childData	Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;
/*     */       //   0	899	0	this	Landroidx/compose/animation/AnimatedContentKt$AnimatedContent$6$1;
/*     */       //   0	899	1	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	899	2	$changed	I
/*     */     }
/*     */     
/*     */     AnimatedContentKt$AnimatedContent$6$1(Transition<S> $receiver, Object $stateForContent, Function1<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec, AnimatedContentTransitionScopeImpl<S> $rootScope, SnapshotStateList<S> $currentlyVisible, Function4<AnimatedContentScope, S, Composer, Integer, Unit> $content) {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AnimatedContentKt$AnimatedContent$3 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     AnimatedContentKt$AnimatedContent$3(Object $targetState, Modifier $modifier, Function1<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec, Alignment $contentAlignment, String $label, Function1<S, Object> $contentKey, Function4<AnimatedContentScope, S, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       AnimatedContentKt.AnimatedContent(this.$targetState, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$label, this.$contentKey, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AnimatedContentKt$AnimatedContent$9 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     AnimatedContentKt$AnimatedContent$9(Transition<S> $receiver, Modifier $modifier, Function1<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec, Alignment $contentAlignment, Function1<S, Object> $contentKey, Function4<AnimatedContentScope, S, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       AnimatedContentKt.AnimatedContent(this.$this_AnimatedContent, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$contentKey, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\AnimatedContentKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */