/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.node.ModifierNodeElement;
/*     */ import androidx.compose.ui.platform.InspectorInfo;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\025\n\002\020\000\n\000\n\002\020\b\n\002\b\004\b\002\030\0002\b\022\004\022\0020\0020\001BN\022\b\b\002\020\003\032\0020\004\022\b\b\002\020\005\032\0020\004\022\b\b\002\020\006\032\0020\004\022\b\b\002\020\007\032\0020\004\022\006\020\b\032\0020\t\022\027\020\n\032\023\022\004\022\0020\f\022\004\022\0020\r0\013¢\006\002\b\016¢\006\002\020\017J\b\020!\032\0020\002H\026J\023\020\"\032\0020\t2\b\020#\032\004\030\0010$H\002J\b\020%\032\0020&H\026J\020\020'\032\0020\r2\006\020(\032\0020\002H\026J\f\020)\032\0020\r*\0020\fH\026R\"\020\007\032\0020\004X\016ø\001\000ø\001\001¢\006\020\n\002\020\024\032\004\b\020\020\021\"\004\b\022\020\023R\"\020\006\032\0020\004X\016ø\001\000ø\001\001¢\006\020\n\002\020\024\032\004\b\025\020\021\"\004\b\026\020\023R\"\020\n\032\023\022\004\022\0020\f\022\004\022\0020\r0\013¢\006\002\b\016¢\006\b\n\000\032\004\b\027\020\030R\032\020\b\032\0020\tX\016¢\006\016\n\000\032\004\b\031\020\032\"\004\b\033\020\034R\"\020\003\032\0020\004X\016ø\001\000ø\001\001¢\006\020\n\002\020\024\032\004\b\035\020\021\"\004\b\036\020\023R\"\020\005\032\0020\004X\016ø\001\000ø\001\001¢\006\020\n\002\020\024\032\004\b\037\020\021\"\004\b \020\023\002\013\n\005\b¡\0360\001\n\002\b!¨\006*"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/PaddingNode;", "start", "Landroidx/compose/ui/unit/Dp;", "top", "end", "bottom", "rtlAware", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM", "()F", "setBottom-0680j_4", "(F)V", "F", "getEnd-D9Ej5fM", "setEnd-0680j_4", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "getStart-D9Ej5fM", "setStart-0680j_4", "getTop-D9Ej5fM", "setTop-0680j_4", "create", "equals", "other", "", "hashCode", "", "update", "node", "inspectableProperties", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n149#2:485\n149#2:486\n149#2:487\n149#2:488\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n*L\n344#1:485\n345#1:486\n346#1:487\n347#1:488\n*E\n"})
/*     */ final class PaddingElement
/*     */   extends ModifierNodeElement<PaddingNode>
/*     */ {
/*     */   private float start;
/*     */   private float top;
/*     */   private float end;
/*     */   private float bottom;
/*     */   private boolean rtlAware;
/*     */   @NotNull
/*     */   private final Function1<InspectorInfo, Unit> inspectorInfo;
/*     */   
/*     */   public final float getStart-D9Ej5fM() {
/* 344 */     return this.start; } public final void setStart-0680j_4(float <set-?>) { this.start = <set-?>; }
/* 345 */   public final float getTop-D9Ej5fM() { return this.top; } public final void setTop-0680j_4(float <set-?>) { this.top = <set-?>; }
/* 346 */   public final float getEnd-D9Ej5fM() { return this.end; } public final void setEnd-0680j_4(float <set-?>) { this.end = <set-?>; }
/* 347 */   public final float getBottom-D9Ej5fM() { return this.bottom; } public final void setBottom-0680j_4(float <set-?>) { this.bottom = <set-?>; }
/* 348 */   public final boolean getRtlAware() { return this.rtlAware; } public final void setRtlAware(boolean <set-?>) { this.rtlAware = <set-?>; } @NotNull
/* 349 */   public final Function1<InspectorInfo, Unit> getInspectorInfo() { return this.inspectorInfo; } private PaddingElement(float start, float top, float end, float bottom, boolean rtlAware, Function1<InspectorInfo, Unit> inspectorInfo) { this.start = start; this.top = top; this.end = end; this.bottom = bottom; this.rtlAware = rtlAware; this.inspectorInfo = inspectorInfo;
/*     */ 
/*     */ 
/*     */     
/* 353 */     if (!(((
/* 354 */       this.start >= 0.0F || Dp.equals-impl0(this.start, Dp.Companion.getUnspecified-D9Ej5fM())) && (
/* 355 */       this.top >= 0.0F || Dp.equals-impl0(this.top, Dp.Companion.getUnspecified-D9Ej5fM())) && (
/* 356 */       this.end >= 0.0F || Dp.equals-impl0(this.end, Dp.Companion.getUnspecified-D9Ej5fM())) && (
/* 357 */       this.bottom >= 0.0F || Dp.equals-impl0(this.bottom, Dp.Companion.getUnspecified-D9Ej5fM()))) ? 1 : 0)) {
/*     */       int $i$a$-require-PaddingElement$1 = 0;
/* 359 */       String str = "Padding must be non-negative";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     }  }
/*     */    @NotNull
/*     */   public PaddingNode create() {
/* 364 */     return new PaddingNode(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
/*     */   }
/*     */   
/*     */   public void update(@NotNull PaddingNode node) {
/* 368 */     Intrinsics.checkNotNullParameter(node, "node"); node.setStart-0680j_4(this.start);
/* 369 */     node.setTop-0680j_4(this.top);
/* 370 */     node.setEnd-0680j_4(this.end);
/* 371 */     node.setBottom-0680j_4(this.bottom);
/* 372 */     node.setRtlAware(this.rtlAware);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 376 */     int result = Dp.hashCode-impl(this.start);
/* 377 */     result = 31 * result + Dp.hashCode-impl(this.top);
/* 378 */     result = 31 * result + Dp.hashCode-impl(this.end);
/* 379 */     result = 31 * result + Dp.hashCode-impl(this.bottom);
/* 380 */     result = 31 * result + Boolean.hashCode(this.rtlAware);
/* 381 */     return result;
/*     */   }
/*     */   public boolean equals(@Nullable Object other) {
/*     */     Object object;
/* 385 */     if (((other instanceof PaddingElement) ? other : null) == null) { (other instanceof PaddingElement) ? other : null; return false; }
/* 386 */      return (Dp.equals-impl0(this.start, ((PaddingElement)object).start) && 
/* 387 */       Dp.equals-impl0(this.top, ((PaddingElement)object).top) && 
/* 388 */       Dp.equals-impl0(this.end, ((PaddingElement)object).end) && 
/* 389 */       Dp.equals-impl0(this.bottom, ((PaddingElement)object).bottom) && 
/* 390 */       this.rtlAware == ((PaddingElement)object).rtlAware);
/*     */   }
/*     */   
/*     */   public void inspectableProperties(@NotNull InspectorInfo $this$inspectableProperties) {
/* 394 */     Intrinsics.checkNotNullParameter($this$inspectableProperties, "<this>"); this.inspectorInfo.invoke($this$inspectableProperties);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\PaddingElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */