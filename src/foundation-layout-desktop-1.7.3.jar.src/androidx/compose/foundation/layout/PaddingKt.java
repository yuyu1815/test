/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.platform.InspectorInfo;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\n\032\032\020\000\032\0020\0012\006\020\002\032\0020\003H\007ø\001\000¢\006\004\b\004\020\005\032&\020\000\032\0020\0012\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\003H\007ø\001\000¢\006\004\b\b\020\t\032:\020\000\032\0020\0012\b\b\002\020\n\032\0020\0032\b\b\002\020\013\032\0020\0032\b\b\002\020\f\032\0020\0032\b\b\002\020\r\032\0020\003H\007ø\001\000¢\006\004\b\016\020\017\032>\020\020\032\0020\021*\0020\0212\b\b\002\020\022\032\0020\0032\b\b\002\020\013\032\0020\0032\b\b\002\020\023\032\0020\0032\b\b\002\020\r\032\0020\003H\007ø\001\000¢\006\004\b\024\020\025\032\031\020\026\032\0020\003*\0020\0012\006\020\027\032\0020\030H\007¢\006\002\020\031\032\031\020\032\032\0020\003*\0020\0012\006\020\027\032\0020\030H\007¢\006\002\020\031\032\024\020\033\032\0020\021*\0020\0212\006\020\034\032\0020\001H\007\032\036\020\033\032\0020\021*\0020\0212\006\020\002\032\0020\003H\007ø\001\000¢\006\004\b\035\020\036\032*\020\033\032\0020\021*\0020\0212\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\003H\007ø\001\000¢\006\004\b\037\020 \032>\020\033\032\0020\021*\0020\0212\b\b\002\020\n\032\0020\0032\b\b\002\020\013\032\0020\0032\b\b\002\020\f\032\0020\0032\b\b\002\020\r\032\0020\003H\007ø\001\000¢\006\004\b!\020\025\002\007\n\005\b¡\0360\001¨\006\""}, d2 = {"PaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "all", "Landroidx/compose/ui/unit/Dp;", "PaddingValues-0680j_4", "(F)Landroidx/compose/foundation/layout/PaddingValues;", "horizontal", "vertical", "PaddingValues-YgX7TsA", "(FF)Landroidx/compose/foundation/layout/PaddingValues;", "start", "top", "end", "bottom", "PaddingValues-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "absolutePadding", "Landroidx/compose/ui/Modifier;", "left", "right", "absolutePadding-qDBjuR0", "(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;", "calculateEndPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateStartPadding", "padding", "paddingValues", "padding-3ABfNKs", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "padding-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "padding-qDBjuR0", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n149#2:485\n149#2:486\n149#2:487\n149#2:488\n149#2:489\n149#2:490\n149#2:491\n149#2:492\n149#2:493\n149#2:494\n149#2:495\n149#2:496\n149#2:497\n149#2:498\n149#2:499\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n51#1:485\n52#1:486\n53#1:487\n54#1:488\n84#1:489\n85#1:490\n157#1:491\n158#1:492\n159#1:493\n160#1:494\n284#1:495\n294#1:496\n295#1:497\n296#1:498\n297#1:499\n*E\n"})
/*     */ public final class PaddingKt
/*     */ {
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final Modifier padding-qDBjuR0(@NotNull Modifier $this$padding_u2dqDBjuR0, float start, float top, float end, float bottom) {
/*  55 */     Intrinsics.checkNotNullParameter($this$padding_u2dqDBjuR0, "$this$padding"); return $this$padding_u2dqDBjuR0.then((Modifier)new PaddingElement(
/*  56 */           start, 
/*  57 */           top, 
/*  58 */           end, 
/*  59 */           bottom, 
/*  60 */           true, new PaddingKt$padding$1(start, top, end, bottom), null)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"})
/*     */   static final class PaddingKt$padding$1 extends Lambda implements Function1<InspectorInfo, Unit> { public final void invoke(@NotNull InspectorInfo $this$$receiver) {
/*  62 */       Intrinsics.checkNotNullParameter($this$$receiver, "$this$$receiver"); $this$$receiver.setName("padding");
/*  63 */       $this$$receiver.getProperties().set("start", Dp.box-impl(this.$start));
/*  64 */       $this$$receiver.getProperties().set("top", Dp.box-impl(this.$top));
/*  65 */       $this$$receiver.getProperties().set("end", Dp.box-impl(this.$end));
/*  66 */       $this$$receiver.getProperties().set("bottom", Dp.box-impl(this.$bottom));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     PaddingKt$padding$1(float $start, float $top, float $end, float $bottom) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final Modifier padding-VpY3zN4(@NotNull Modifier $this$padding_u2dVpY3zN4, float horizontal, float vertical) {
/*  86 */     Intrinsics.checkNotNullParameter($this$padding_u2dVpY3zN4, "$this$padding"); return $this$padding_u2dVpY3zN4.then((Modifier)new PaddingElement(
/*  87 */           horizontal, 
/*  88 */           vertical, 
/*  89 */           horizontal, 
/*  90 */           vertical, 
/*  91 */           true, new PaddingKt$padding$2(horizontal, vertical), null)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"})
/*     */   static final class PaddingKt$padding$2 extends Lambda implements Function1<InspectorInfo, Unit> { public final void invoke(@NotNull InspectorInfo $this$$receiver) {
/*  93 */       Intrinsics.checkNotNullParameter($this$$receiver, "$this$$receiver"); $this$$receiver.setName("padding");
/*  94 */       $this$$receiver.getProperties().set("horizontal", Dp.box-impl(this.$horizontal));
/*  95 */       $this$$receiver.getProperties().set("vertical", Dp.box-impl(this.$vertical));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     PaddingKt$padding$2(float $horizontal, float $vertical) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final Modifier padding-3ABfNKs(@NotNull Modifier $this$padding_u2d3ABfNKs, float all) {
/* 111 */     Intrinsics.checkNotNullParameter($this$padding_u2d3ABfNKs, "$this$padding"); return $this$padding_u2d3ABfNKs.then((Modifier)new PaddingElement(
/* 112 */           all, 
/* 113 */           all, 
/* 114 */           all, 
/* 115 */           all, 
/* 116 */           true, new PaddingKt$padding$3(all), null)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"})
/*     */   static final class PaddingKt$padding$3 extends Lambda implements Function1<InspectorInfo, Unit> { public final void invoke(@NotNull InspectorInfo $this$$receiver) {
/* 118 */       Intrinsics.checkNotNullParameter($this$$receiver, "$this$$receiver"); $this$$receiver.setName("padding");
/* 119 */       $this$$receiver.setValue(Dp.box-impl(this.$all));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     PaddingKt$padding$3(float $all) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final Modifier padding(@NotNull Modifier $this$padding, @NotNull PaddingValues paddingValues) {
/* 135 */     Intrinsics.checkNotNullParameter($this$padding, "<this>"); Intrinsics.checkNotNullParameter(paddingValues, "paddingValues"); return $this$padding.then((Modifier)new PaddingValuesElement(
/* 136 */           paddingValues, new PaddingKt$padding$4(paddingValues))); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"})
/*     */   static final class PaddingKt$padding$4 extends Lambda implements Function1<InspectorInfo, Unit> { public final void invoke(@NotNull InspectorInfo $this$$receiver) {
/* 138 */       Intrinsics.checkNotNullParameter($this$$receiver, "$this$$receiver"); $this$$receiver.setName("padding");
/* 139 */       $this$$receiver.getProperties().set("paddingValues", this.$paddingValues);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     PaddingKt$padding$4(PaddingValues $paddingValues) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final Modifier absolutePadding-qDBjuR0(@NotNull Modifier $this$absolutePadding_u2dqDBjuR0, float left, float top, float right, float bottom) {
/* 161 */     Intrinsics.checkNotNullParameter($this$absolutePadding_u2dqDBjuR0, "$this$absolutePadding"); return $this$absolutePadding_u2dqDBjuR0.then(
/* 162 */         (Modifier)new PaddingElement(
/* 163 */           left, 
/* 164 */           top, 
/* 165 */           right, 
/* 166 */           bottom, 
/* 167 */           false, new PaddingKt$absolutePadding$1(left, top, right, bottom), null)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"})
/*     */   static final class PaddingKt$absolutePadding$1 extends Lambda implements Function1<InspectorInfo, Unit> { public final void invoke(@NotNull InspectorInfo $this$$receiver) {
/* 169 */       Intrinsics.checkNotNullParameter($this$$receiver, "$this$$receiver"); $this$$receiver.setName("absolutePadding");
/* 170 */       $this$$receiver.getProperties().set("left", Dp.box-impl(this.$left));
/* 171 */       $this$$receiver.getProperties().set("top", Dp.box-impl(this.$top));
/* 172 */       $this$$receiver.getProperties().set("right", Dp.box-impl(this.$right));
/* 173 */       $this$$receiver.getProperties().set("bottom", Dp.box-impl(this.$bottom));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     PaddingKt$absolutePadding$1(float $left, float $top, float $right, float $bottom) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   public static final float calculateStartPadding(@NotNull PaddingValues $this$calculateStartPadding, @NotNull LayoutDirection layoutDirection) {
/* 255 */     Intrinsics.checkNotNullParameter($this$calculateStartPadding, "<this>"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); return (layoutDirection == LayoutDirection.Ltr) ? 
/* 256 */       $this$calculateStartPadding.calculateLeftPadding-u2uoSUM(layoutDirection) : 
/*     */       
/* 258 */       $this$calculateStartPadding.calculateRightPadding-u2uoSUM(layoutDirection);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   public static final float calculateEndPadding(@NotNull PaddingValues $this$calculateEndPadding, @NotNull LayoutDirection layoutDirection) {
/* 267 */     Intrinsics.checkNotNullParameter($this$calculateEndPadding, "<this>"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); return (layoutDirection == LayoutDirection.Ltr) ? 
/* 268 */       $this$calculateEndPadding.calculateRightPadding-u2uoSUM(layoutDirection) : 
/*     */       
/* 270 */       $this$calculateEndPadding.calculateLeftPadding-u2uoSUM(layoutDirection);
/*     */   }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final PaddingValues PaddingValues-0680j_4(float all) {
/* 277 */     return new PaddingValuesImpl(all, all, all, all, null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final PaddingValues PaddingValues-YgX7TsA(float horizontal, float vertical) {
/* 285 */     return new PaddingValuesImpl(horizontal, vertical, horizontal, vertical, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final PaddingValues PaddingValues-a9UjIt4(float start, float top, float end, float bottom) {
/* 298 */     return new PaddingValuesImpl(start, top, end, bottom, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\PaddingKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */