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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\f\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\004\b\002\030\0002\b\022\004\022\0020\0020\001B6\022\006\020\003\032\0020\004\022\006\020\005\032\0020\004\022\006\020\006\032\0020\007\022\027\020\b\032\023\022\004\022\0020\n\022\004\022\0020\0130\t¢\006\002\b\f¢\006\002\020\rJ\b\020\026\032\0020\002H\026J\023\020\027\032\0020\0072\b\020\030\032\004\030\0010\031H\002J\b\020\032\032\0020\033H\026J\b\020\034\032\0020\035H\026J\020\020\036\032\0020\0132\006\020\037\032\0020\002H\026J\f\020 \032\0020\013*\0020\nH\026R\"\020\b\032\023\022\004\022\0020\n\022\004\022\0020\0130\t¢\006\002\b\f¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\024\032\004\b\022\020\023R\031\020\005\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\024\032\004\b\025\020\023\002\013\n\005\b¡\0360\001\n\002\b!¨\006!"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/OffsetNode;", "x", "Landroidx/compose/ui/unit/Dp;", "y", "rtlAware", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "getRtlAware", "()Z", "getX-D9Ej5fM", "()F", "F", "getY-D9Ej5fM", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "node", "inspectableProperties", "foundation-layout"})
/*     */ final class OffsetElement
/*     */   extends ModifierNodeElement<OffsetNode>
/*     */ {
/*     */   private final float x;
/*     */   private final float y;
/*     */   private final boolean rtlAware;
/*     */   @NotNull
/*     */   private final Function1<InspectorInfo, Unit> inspectorInfo;
/*     */   
/*     */   public final float getX-D9Ej5fM() {
/* 145 */     return this.x;
/* 146 */   } public final float getY-D9Ej5fM() { return this.y; }
/* 147 */   public final boolean getRtlAware() { return this.rtlAware; } @NotNull
/* 148 */   public final Function1<InspectorInfo, Unit> getInspectorInfo() { return this.inspectorInfo; } private OffsetElement(float x, float y, boolean rtlAware, Function1<InspectorInfo, Unit> inspectorInfo) { this.x = x; this.y = y; this.rtlAware = rtlAware; this.inspectorInfo = inspectorInfo; }
/*     */    @NotNull
/*     */   public OffsetNode create() {
/* 151 */     return new OffsetNode(this.x, this.y, this.rtlAware, null);
/*     */   }
/*     */   
/*     */   public void update(@NotNull OffsetNode node) {
/* 155 */     Intrinsics.checkNotNullParameter(node, "node"); node.setX-0680j_4(this.x);
/* 156 */     node.setY-0680j_4(this.y);
/* 157 */     node.setRtlAware(this.rtlAware);
/*     */   }
/*     */   public boolean equals(@Nullable Object other) {
/*     */     Object object;
/* 161 */     if (this == other) return true; 
/* 162 */     if (((other instanceof OffsetElement) ? other : null) == null) { (other instanceof OffsetElement) ? other : null; return false; }
/*     */     
/* 164 */     return (Dp.equals-impl0(this.x, ((OffsetElement)object).x) && 
/* 165 */       Dp.equals-impl0(this.y, ((OffsetElement)object).y) && 
/* 166 */       this.rtlAware == ((OffsetElement)object).rtlAware);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 170 */     int result = Dp.hashCode-impl(this.x);
/* 171 */     result = 31 * result + Dp.hashCode-impl(this.y);
/* 172 */     result = 31 * result + Boolean.hashCode(this.rtlAware);
/* 173 */     return result;
/*     */   } @NotNull
/*     */   public String toString() {
/* 176 */     return "OffsetModifierElement(x=" + Dp.toString-impl(this.x) + ", y=" + Dp.toString-impl(this.y) + ", rtlAware=" + this.rtlAware + ')';
/*     */   } public void inspectableProperties(@NotNull InspectorInfo $this$inspectableProperties) {
/* 178 */     Intrinsics.checkNotNullParameter($this$inspectableProperties, "<this>"); this.inspectorInfo.invoke($this$inspectableProperties);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\OffsetElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */