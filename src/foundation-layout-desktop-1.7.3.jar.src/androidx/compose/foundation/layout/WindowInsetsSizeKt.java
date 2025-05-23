/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.platform.InspectableValueKt;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\032\024\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\003H\007\032\024\020\004\032\0020\001*\0020\0012\006\020\002\032\0020\003H\007\032\024\020\005\032\0020\001*\0020\0012\006\020\002\032\0020\003H\007\032\024\020\006\032\0020\001*\0020\0012\006\020\002\032\0020\003H\007¨\006\007"}, d2 = {"windowInsetsBottomHeight", "Landroidx/compose/ui/Modifier;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsetsEndWidth", "windowInsetsStartWidth", "windowInsetsTopHeight", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,214:1\n135#2:215\n135#2:216\n135#2:217\n135#2:218\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n50#1:215\n75#1:216\n98#1:217\n117#1:218\n*E\n"})
/*     */ public final class WindowInsetsSizeKt
/*     */ {
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\032\n\000\n\002\020\b\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\006H\n¢\006\004\b\007\020\b"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/WindowInsets;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "invoke", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Ljava/lang/Integer;"})
/*     */   static final class WindowInsetsSizeKt$windowInsetsStartWidth$2
/*     */     extends Lambda
/*     */     implements Function3<WindowInsets, LayoutDirection, Density, Integer>
/*     */   {
/*     */     public static final WindowInsetsSizeKt$windowInsetsStartWidth$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsStartWidth$2();
/*     */     
/*     */     @NotNull
/*     */     public final Integer invoke(@NotNull WindowInsets $this$$receiver, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
/*     */       Intrinsics.checkNotNullParameter($this$$receiver, "$this$$receiver");
/*     */       Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */       Intrinsics.checkNotNullParameter(density, "density");
/*     */       return Integer.valueOf((layoutDirection == LayoutDirection.Ltr) ? $this$$receiver.getLeft(density, layoutDirection) : $this$$receiver.getRight(density, layoutDirection));
/*     */     }
/*     */     
/*     */     WindowInsetsSizeKt$windowInsetsStartWidth$2() {
/*     */       super(3);
/*     */     }
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final Modifier windowInsetsStartWidth(@NotNull Modifier $this$windowInsetsStartWidth, @NotNull WindowInsets insets) {
/*  49 */     Intrinsics.checkNotNullParameter($this$windowInsetsStartWidth, "<this>"); Intrinsics.checkNotNullParameter(insets, "insets");
/*  50 */     int $i$f$debugInspectorInfo = 0; return $this$windowInsetsStartWidth.then((Modifier)new DerivedWidthModifier(insets, 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 215 */           InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsSizeKt$windowInsetsStartWidth$$inlined$debugInspectorInfo$1(insets) : InspectableValueKt.getNoInspectorInfo(), WindowInsetsSizeKt$windowInsetsStartWidth$2.INSTANCE)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\032\n\000\n\002\020\b\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\006H\n¢\006\004\b\007\020\b"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/WindowInsets;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "invoke", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Ljava/lang/Integer;"}) static final class WindowInsetsSizeKt$windowInsetsEndWidth$2 extends Lambda implements Function3<WindowInsets, LayoutDirection, Density, Integer> {
/* 216 */     public static final WindowInsetsSizeKt$windowInsetsEndWidth$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsEndWidth$2(); @NotNull public final Integer invoke(@NotNull WindowInsets $this$$receiver, @NotNull LayoutDirection layoutDirection, @NotNull Density density) { Intrinsics.checkNotNullParameter($this$$receiver, "$this$$receiver"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(density, "density"); return Integer.valueOf((layoutDirection == LayoutDirection.Rtl) ? $this$$receiver.getLeft(density, layoutDirection) : $this$$receiver.getRight(density, layoutDirection)); } WindowInsetsSizeKt$windowInsetsEndWidth$2() { super(3); } } @Stable @NotNull public static final Modifier windowInsetsEndWidth(@NotNull Modifier $this$windowInsetsEndWidth, @NotNull WindowInsets insets) { Intrinsics.checkNotNullParameter($this$windowInsetsEndWidth, "<this>"); Intrinsics.checkNotNullParameter(insets, "insets"); int $i$f$debugInspectorInfo = 0; return $this$windowInsetsEndWidth.then((Modifier)new DerivedWidthModifier(insets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsSizeKt$windowInsetsEndWidth$$inlined$debugInspectorInfo$1(insets) : InspectableValueKt.getNoInspectorInfo(), WindowInsetsSizeKt$windowInsetsEndWidth$2.INSTANCE)); } @Stable @NotNull public static final Modifier windowInsetsTopHeight(@NotNull Modifier $this$windowInsetsTopHeight, @NotNull WindowInsets insets) { Intrinsics.checkNotNullParameter($this$windowInsetsTopHeight, "<this>"); Intrinsics.checkNotNullParameter(insets, "insets"); int $i$f$debugInspectorInfo = 0;
/* 217 */     return $this$windowInsetsTopHeight.then((Modifier)new DerivedHeightModifier(insets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1(insets) : InspectableValueKt.getNoInspectorInfo(), WindowInsetsSizeKt$windowInsetsTopHeight$2.INSTANCE)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\b\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/WindowInsets;", "it", "Landroidx/compose/ui/unit/Density;", "invoke", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/unit/Density;)Ljava/lang/Integer;"}) static final class WindowInsetsSizeKt$windowInsetsTopHeight$2 extends Lambda implements Function2<WindowInsets, Density, Integer> {
/* 218 */     public static final WindowInsetsSizeKt$windowInsetsTopHeight$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsTopHeight$2(); @NotNull public final Integer invoke(@NotNull WindowInsets $this$$receiver, @NotNull Density it) { Intrinsics.checkNotNullParameter($this$$receiver, "$this$$receiver"); Intrinsics.checkNotNullParameter(it, "it"); return Integer.valueOf($this$$receiver.getTop(it)); } WindowInsetsSizeKt$windowInsetsTopHeight$2() { super(2); } } @Stable @NotNull public static final Modifier windowInsetsBottomHeight(@NotNull Modifier $this$windowInsetsBottomHeight, @NotNull WindowInsets insets) { Intrinsics.checkNotNullParameter($this$windowInsetsBottomHeight, "<this>"); Intrinsics.checkNotNullParameter(insets, "insets"); int $i$f$debugInspectorInfo = 0; return $this$windowInsetsBottomHeight.then((Modifier)new DerivedHeightModifier(insets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1(insets) : InspectableValueKt.getNoInspectorInfo(), WindowInsetsSizeKt$windowInsetsBottomHeight$2.INSTANCE)); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\b\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/WindowInsets;", "it", "Landroidx/compose/ui/unit/Density;", "invoke", "(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/unit/Density;)Ljava/lang/Integer;"})
/*     */   static final class WindowInsetsSizeKt$windowInsetsBottomHeight$2 extends Lambda implements Function2<WindowInsets, Density, Integer> {
/*     */     public static final WindowInsetsSizeKt$windowInsetsBottomHeight$2 INSTANCE = new WindowInsetsSizeKt$windowInsetsBottomHeight$2();
/*     */     
/*     */     @NotNull
/*     */     public final Integer invoke(@NotNull WindowInsets $this$$receiver, @NotNull Density it) {
/*     */       Intrinsics.checkNotNullParameter($this$$receiver, "$this$$receiver");
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return Integer.valueOf($this$$receiver.getBottom(it));
/*     */     }
/*     */     
/*     */     WindowInsetsSizeKt$windowInsetsBottomHeight$2() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\WindowInsetsSizeKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */