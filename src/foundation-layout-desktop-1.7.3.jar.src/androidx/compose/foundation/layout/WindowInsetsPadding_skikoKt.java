/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.platform.InspectableValueKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\030\002\n\002\b\r\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\032\n\020\000\032\0020\001*\0020\001\032\n\020\002\032\0020\001*\0020\001\032\n\020\003\032\0020\001*\0020\001\032\n\020\004\032\0020\001*\0020\001\032\n\020\005\032\0020\001*\0020\001\032\n\020\006\032\0020\001*\0020\001\032\n\020\007\032\0020\001*\0020\001\032\n\020\b\032\0020\001*\0020\001\032\n\020\t\032\0020\001*\0020\001\032\n\020\n\032\0020\001*\0020\001\032\n\020\013\032\0020\001*\0020\001\032\n\020\f\032\0020\001*\0020\001\032B\020\r\032\0020\001*\0020\0012\031\b\b\020\016\032\023\022\004\022\0020\020\022\004\022\0020\0210\017¢\006\002\b\0222\023\b\004\020\023\032\r\022\004\022\0020\0250\024¢\006\002\b\026H\b¢\006\002\020\027¨\006\030"}, d2 = {"captionBarPadding", "Landroidx/compose/ui/Modifier;", "displayCutoutPadding", "imePadding", "mandatorySystemGesturesPadding", "navigationBarsPadding", "safeContentPadding", "safeDrawingPadding", "safeGesturesPadding", "statusBarsPadding", "systemBarsPadding", "systemGesturesPadding", "waterfallPadding", "windowInsetsPadding", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "insetsCalculation", "Lkotlin/Function0;", "Landroidx/compose/foundation/layout/WindowInsets;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nWindowInsetsPadding.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.skiko.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_skikoKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,96:1\n92#1,4:98\n92#1,4:103\n92#1,4:108\n92#1,4:113\n92#1,4:118\n92#1,4:123\n92#1,4:128\n92#1,4:133\n92#1,4:138\n92#1,4:143\n92#1,4:148\n92#1,4:153\n135#2:97\n135#2:102\n135#2:107\n135#2:112\n135#2:117\n135#2:122\n135#2:127\n135#2:132\n135#2:137\n135#2:142\n135#2:147\n135#2:152\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.skiko.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_skikoKt\n*L\n28#1:98,4\n33#1:103,4\n38#1:108,4\n43#1:113,4\n48#1:118,4\n53#1:123,4\n58#1:128,4\n63#1:133,4\n68#1:138,4\n73#1:143,4\n78#1:148,4\n83#1:153,4\n28#1:97\n33#1:102\n38#1:107\n43#1:112\n48#1:117\n53#1:122\n58#1:127\n63#1:132\n68#1:137\n73#1:142\n78#1:147\n83#1:152\n*E\n"})
/*     */ public final class WindowInsetsPadding_skikoKt
/*     */ {
/*     */   @NotNull
/*     */   public static final Modifier safeDrawingPadding(@NotNull Modifier $this$safeDrawingPadding) {
/*  28 */     Intrinsics.checkNotNullParameter($this$safeDrawingPadding, "<this>"); Modifier modifier = $this$safeDrawingPadding; int $i$f$debugInspectorInfo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  97 */     Function1 function1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_skikoKt$safeDrawingPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(); int $i$f$windowInsetsPadding = 0;
/*  98 */     return ComposedModifierKt.composed(modifier, function1, new WindowInsetsPadding_skikoKt$safeDrawingPadding$$inlined$windowInsetsPadding$1()); } @NotNull
/*     */   public static final Modifier safeGesturesPadding(@NotNull Modifier $this$safeGesturesPadding) { Intrinsics.checkNotNullParameter($this$safeGesturesPadding, "<this>");
/*     */     Modifier modifier = $this$safeGesturesPadding;
/*     */     int $i$f$debugInspectorInfo = 0;
/* 102 */     Function1 function1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_skikoKt$safeGesturesPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(); int $i$f$windowInsetsPadding = 0;
/* 103 */     return ComposedModifierKt.composed(modifier, function1, new WindowInsetsPadding_skikoKt$safeGesturesPadding$$inlined$windowInsetsPadding$1()); } @NotNull
/*     */   public static final Modifier safeContentPadding(@NotNull Modifier $this$safeContentPadding) { Intrinsics.checkNotNullParameter($this$safeContentPadding, "<this>");
/*     */     Modifier modifier = $this$safeContentPadding;
/*     */     int $i$f$debugInspectorInfo = 0;
/* 107 */     Function1 function1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_skikoKt$safeContentPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(); int $i$f$windowInsetsPadding = 0;
/* 108 */     return ComposedModifierKt.composed(modifier, function1, new WindowInsetsPadding_skikoKt$safeContentPadding$$inlined$windowInsetsPadding$1()); } @NotNull
/*     */   public static final Modifier systemBarsPadding(@NotNull Modifier $this$systemBarsPadding) { Intrinsics.checkNotNullParameter($this$systemBarsPadding, "<this>");
/*     */     Modifier modifier = $this$systemBarsPadding;
/*     */     int $i$f$debugInspectorInfo = 0;
/* 112 */     Function1 function1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_skikoKt$systemBarsPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(); int $i$f$windowInsetsPadding = 0;
/* 113 */     return ComposedModifierKt.composed(modifier, function1, new WindowInsetsPadding_skikoKt$systemBarsPadding$$inlined$windowInsetsPadding$1()); } @NotNull
/*     */   public static final Modifier displayCutoutPadding(@NotNull Modifier $this$displayCutoutPadding) { Intrinsics.checkNotNullParameter($this$displayCutoutPadding, "<this>");
/*     */     Modifier modifier = $this$displayCutoutPadding;
/*     */     int $i$f$debugInspectorInfo = 0;
/* 117 */     Function1 function1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_skikoKt$displayCutoutPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(); int $i$f$windowInsetsPadding = 0;
/* 118 */     return ComposedModifierKt.composed(modifier, function1, new WindowInsetsPadding_skikoKt$displayCutoutPadding$$inlined$windowInsetsPadding$1()); } @NotNull
/*     */   public static final Modifier statusBarsPadding(@NotNull Modifier $this$statusBarsPadding) { Intrinsics.checkNotNullParameter($this$statusBarsPadding, "<this>");
/*     */     Modifier modifier = $this$statusBarsPadding;
/*     */     int $i$f$debugInspectorInfo = 0;
/* 122 */     Function1 function1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_skikoKt$statusBarsPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(); int $i$f$windowInsetsPadding = 0;
/* 123 */     return ComposedModifierKt.composed(modifier, function1, new WindowInsetsPadding_skikoKt$statusBarsPadding$$inlined$windowInsetsPadding$1()); } @NotNull
/*     */   public static final Modifier imePadding(@NotNull Modifier $this$imePadding) { Intrinsics.checkNotNullParameter($this$imePadding, "<this>");
/*     */     Modifier modifier = $this$imePadding;
/*     */     int $i$f$debugInspectorInfo = 0;
/* 127 */     Function1 function1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_skikoKt$imePadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(); int $i$f$windowInsetsPadding = 0;
/* 128 */     return ComposedModifierKt.composed(modifier, function1, new WindowInsetsPadding_skikoKt$imePadding$$inlined$windowInsetsPadding$1()); } @NotNull
/*     */   public static final Modifier navigationBarsPadding(@NotNull Modifier $this$navigationBarsPadding) { Intrinsics.checkNotNullParameter($this$navigationBarsPadding, "<this>");
/*     */     Modifier modifier = $this$navigationBarsPadding;
/*     */     int $i$f$debugInspectorInfo = 0;
/* 132 */     Function1 function1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_skikoKt$navigationBarsPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(); int $i$f$windowInsetsPadding = 0;
/* 133 */     return ComposedModifierKt.composed(modifier, function1, new WindowInsetsPadding_skikoKt$navigationBarsPadding$$inlined$windowInsetsPadding$1()); } @NotNull
/*     */   public static final Modifier captionBarPadding(@NotNull Modifier $this$captionBarPadding) { Intrinsics.checkNotNullParameter($this$captionBarPadding, "<this>");
/*     */     Modifier modifier = $this$captionBarPadding;
/*     */     int $i$f$debugInspectorInfo = 0;
/* 137 */     Function1 function1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_skikoKt$captionBarPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(); int $i$f$windowInsetsPadding = 0;
/* 138 */     return ComposedModifierKt.composed(modifier, function1, new WindowInsetsPadding_skikoKt$captionBarPadding$$inlined$windowInsetsPadding$1()); } @NotNull
/*     */   public static final Modifier waterfallPadding(@NotNull Modifier $this$waterfallPadding) { Intrinsics.checkNotNullParameter($this$waterfallPadding, "<this>");
/*     */     Modifier modifier = $this$waterfallPadding;
/*     */     int $i$f$debugInspectorInfo = 0;
/* 142 */     Function1 function1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_skikoKt$waterfallPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(); int $i$f$windowInsetsPadding = 0;
/* 143 */     return ComposedModifierKt.composed(modifier, function1, new WindowInsetsPadding_skikoKt$waterfallPadding$$inlined$windowInsetsPadding$1()); } @NotNull
/*     */   public static final Modifier systemGesturesPadding(@NotNull Modifier $this$systemGesturesPadding) { Intrinsics.checkNotNullParameter($this$systemGesturesPadding, "<this>");
/*     */     Modifier modifier = $this$systemGesturesPadding;
/*     */     int $i$f$debugInspectorInfo = 0;
/* 147 */     Function1 function1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_skikoKt$systemGesturesPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(); int $i$f$windowInsetsPadding = 0;
/* 148 */     return ComposedModifierKt.composed(modifier, function1, new WindowInsetsPadding_skikoKt$systemGesturesPadding$$inlined$windowInsetsPadding$1()); } @NotNull
/*     */   public static final Modifier mandatorySystemGesturesPadding(@NotNull Modifier $this$mandatorySystemGesturesPadding) { Intrinsics.checkNotNullParameter($this$mandatorySystemGesturesPadding, "<this>");
/*     */     Modifier modifier = $this$mandatorySystemGesturesPadding;
/*     */     int $i$f$debugInspectorInfo = 0;
/* 152 */     Function1 function1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_skikoKt$mandatorySystemGesturesPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(); int $i$f$windowInsetsPadding = 0;
/* 153 */     return ComposedModifierKt.composed(modifier, function1, new WindowInsetsPadding_skikoKt$mandatorySystemGesturesPadding$$inlined$windowInsetsPadding$1()); }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   private static final Modifier windowInsetsPadding(Modifier $this$windowInsetsPadding, Function1 inspectorInfo, Function2<? super Composer, ? super Integer, ? extends WindowInsets> insetsCalculation) {
/*     */     int $i$f$windowInsetsPadding = 0;
/*     */     return ComposedModifierKt.composed($this$windowInsetsPadding, inspectorInfo, new WindowInsetsPadding_skikoKt$windowInsetsPadding$1(insetsCalculation));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\001H\013¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"})
/*     */   @SourceDebugExtension({"SMAP\nWindowInsetsPadding.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.skiko.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_skikoKt$windowInsetsPadding$1\n*L\n1#1,96:1\n*E\n"})
/*     */   public static final class WindowInsetsPadding_skikoKt$windowInsetsPadding$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
/*     */     @Composable
/*     */     @NotNull
/*     */     public final Modifier invoke(@NotNull Modifier $this$composed, @Nullable Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$composed, "$this$composed");
/*     */       $composer.startReplaceGroup(1671778);
/*     */       ComposerKt.sourceInformation($composer, "C92@3183L19:WindowInsetsPadding.skiko.kt#2w3rfo");
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventStart(1671778, $changed, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.skiko.kt:92)"); 
/*     */       WindowInsets insets = (WindowInsets)this.$insetsCalculation.invoke($composer, Integer.valueOf(0));
/*     */       InsetsPaddingModifier insetsPaddingModifier = new InsetsPaddingModifier(insets);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */       $composer.endReplaceGroup();
/*     */       return (Modifier)insetsPaddingModifier;
/*     */     }
/*     */     
/*     */     public WindowInsetsPadding_skikoKt$windowInsetsPadding$1(Function2<Composer, Integer, WindowInsets> $insetsCalculation) {
/*     */       super(3);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\WindowInsetsPadding_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */