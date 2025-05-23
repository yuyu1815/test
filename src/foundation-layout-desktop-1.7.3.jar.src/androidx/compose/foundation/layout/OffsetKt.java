/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.platform.InspectorInfo;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.IntOffset;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\032#\020\000\032\0020\001*\0020\0012\027\020\002\032\023\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\b\006\032*\020\000\032\0020\001*\0020\0012\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\bH\007ø\001\000¢\006\004\b\n\020\013\032#\020\002\032\0020\001*\0020\0012\027\020\002\032\023\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\b\006\032*\020\002\032\0020\001*\0020\0012\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\bH\007ø\001\000¢\006\004\b\f\020\013\002\007\n\005\b¡\0360\001¨\006\r"}, d2 = {"absoluteOffset", "Landroidx/compose/ui/Modifier;", "offset", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/ExtensionFunctionType;", "x", "Landroidx/compose/ui/unit/Dp;", "y", "absoluteOffset-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "offset-VpY3zN4", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,256:1\n149#2:257\n149#2:258\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n49#1:257\n75#1:258\n*E\n"})
/*     */ public final class OffsetKt
/*     */ {
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final Modifier offset-VpY3zN4(@NotNull Modifier $this$offset_u2dVpY3zN4, float x, float y) {
/*  49 */     Intrinsics.checkNotNullParameter($this$offset_u2dVpY3zN4, "$this$offset"); return $this$offset_u2dVpY3zN4.then((Modifier)new OffsetElement(
/*  50 */           x, 
/*  51 */           y, 
/*  52 */           true, new OffsetKt$offset$1(x, y), null)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"})
/*     */   static final class OffsetKt$offset$1 extends Lambda implements Function1<InspectorInfo, Unit> { public final void invoke(@NotNull InspectorInfo $this$$receiver) {
/*  54 */       Intrinsics.checkNotNullParameter($this$$receiver, "$this$$receiver"); $this$$receiver.setName("offset");
/*  55 */       $this$$receiver.getProperties().set("x", Dp.box-impl(this.$x));
/*  56 */       $this$$receiver.getProperties().set("y", Dp.box-impl(this.$y));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     OffsetKt$offset$1(float $x, float $y) {
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
/*     */   public static final Modifier absoluteOffset-VpY3zN4(@NotNull Modifier $this$absoluteOffset_u2dVpY3zN4, float x, float y) {
/*  75 */     Intrinsics.checkNotNullParameter($this$absoluteOffset_u2dVpY3zN4, "$this$absoluteOffset"); return $this$absoluteOffset_u2dVpY3zN4.then((Modifier)new OffsetElement(
/*  76 */           x, 
/*  77 */           y, 
/*  78 */           false, new OffsetKt$absoluteOffset$1(x, y), null)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"})
/*     */   static final class OffsetKt$absoluteOffset$1 extends Lambda implements Function1<InspectorInfo, Unit> { public final void invoke(@NotNull InspectorInfo $this$$receiver) {
/*  80 */       Intrinsics.checkNotNullParameter($this$$receiver, "$this$$receiver"); $this$$receiver.setName("absoluteOffset");
/*  81 */       $this$$receiver.getProperties().set("x", Dp.box-impl(this.$x));
/*  82 */       $this$$receiver.getProperties().set("y", Dp.box-impl(this.$y));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     OffsetKt$absoluteOffset$1(float $x, float $y) {
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
/*     */   @NotNull
/*     */   public static final Modifier offset(@NotNull Modifier $this$offset, @NotNull Function1<? super Density, IntOffset> offset) {
/* 105 */     Intrinsics.checkNotNullParameter($this$offset, "<this>"); Intrinsics.checkNotNullParameter(offset, "offset"); return $this$offset.then(
/* 106 */         (Modifier)new OffsetPxElement(
/* 107 */           offset, 
/* 108 */           true, new OffsetKt$offset$2(offset))); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"})
/*     */   static final class OffsetKt$offset$2 extends Lambda implements Function1<InspectorInfo, Unit> { public final void invoke(@NotNull InspectorInfo $this$$receiver) {
/* 110 */       Intrinsics.checkNotNullParameter($this$$receiver, "$this$$receiver"); $this$$receiver.setName("offset");
/* 111 */       $this$$receiver.getProperties().set("offset", this.$offset);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     OffsetKt$offset$2(Function1<Density, IntOffset> $offset) {
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
/*     */   @NotNull
/*     */   public static final Modifier absoluteOffset(@NotNull Modifier $this$absoluteOffset, @NotNull Function1<? super Density, IntOffset> offset) {
/* 135 */     Intrinsics.checkNotNullParameter($this$absoluteOffset, "<this>"); Intrinsics.checkNotNullParameter(offset, "offset"); return $this$absoluteOffset.then((Modifier)new OffsetPxElement(
/* 136 */           offset, 
/* 137 */           false, new OffsetKt$absoluteOffset$2(offset))); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke"})
/*     */   static final class OffsetKt$absoluteOffset$2 extends Lambda implements Function1<InspectorInfo, Unit> { public final void invoke(@NotNull InspectorInfo $this$$receiver) {
/* 139 */       Intrinsics.checkNotNullParameter($this$$receiver, "$this$$receiver"); $this$$receiver.setName("absoluteOffset");
/* 140 */       $this$$receiver.getProperties().set("offset", this.$offset);
/*     */     }
/*     */     
/*     */     OffsetKt$absoluteOffset$2(Function1<Density, IntOffset> $offset) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\OffsetKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */