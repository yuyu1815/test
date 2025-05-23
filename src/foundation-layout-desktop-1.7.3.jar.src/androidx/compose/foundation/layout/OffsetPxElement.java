/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.node.ModifierNodeElement;
/*     */ import androidx.compose.ui.platform.InspectorInfo;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.IntOffset;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\002\n\002\b\t\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\004\b\002\030\0002\b\022\004\022\0020\0020\001B?\022\027\020\003\032\023\022\004\022\0020\005\022\004\022\0020\0060\004¢\006\002\b\007\022\006\020\b\032\0020\t\022\027\020\n\032\023\022\004\022\0020\013\022\004\022\0020\f0\004¢\006\002\b\007¢\006\002\020\rJ\b\020\023\032\0020\002H\026J\023\020\024\032\0020\t2\b\020\025\032\004\030\0010\026H\002J\b\020\027\032\0020\030H\026J\b\020\031\032\0020\032H\026J\020\020\033\032\0020\f2\006\020\034\032\0020\002H\026J\f\020\035\032\0020\f*\0020\013H\026R\"\020\n\032\023\022\004\022\0020\013\022\004\022\0020\f0\004¢\006\002\b\007¢\006\b\n\000\032\004\b\016\020\017R\"\020\003\032\023\022\004\022\0020\005\022\004\022\0020\0060\004¢\006\002\b\007¢\006\b\n\000\032\004\b\020\020\017R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\021\020\022¨\006\036"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/OffsetPxNode;", "offset", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/ExtensionFunctionType;", "rtlAware", "", "inspectorInfo", "Landroidx/compose/ui/platform/InspectorInfo;", "", "(Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;)V", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "getOffset", "getRtlAware", "()Z", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "node", "inspectableProperties", "foundation-layout"})
/*     */ final class OffsetPxElement
/*     */   extends ModifierNodeElement<OffsetPxNode>
/*     */ {
/*     */   @NotNull
/*     */   private final Function1<Density, IntOffset> offset;
/*     */   private final boolean rtlAware;
/*     */   @NotNull
/*     */   private final Function1<InspectorInfo, Unit> inspectorInfo;
/*     */   
/*     */   @NotNull
/*     */   public final Function1<Density, IntOffset> getOffset() {
/* 203 */     return this.offset;
/* 204 */   } public final boolean getRtlAware() { return this.rtlAware; } @NotNull
/* 205 */   public final Function1<InspectorInfo, Unit> getInspectorInfo() { return this.inspectorInfo; } public OffsetPxElement(@NotNull Function1<Density, IntOffset> offset, boolean rtlAware, @NotNull Function1<InspectorInfo, Unit> inspectorInfo) { this.offset = offset; this.rtlAware = rtlAware; this.inspectorInfo = inspectorInfo; }
/*     */    @NotNull
/*     */   public OffsetPxNode create() {
/* 208 */     return new OffsetPxNode(this.offset, this.rtlAware);
/*     */   }
/*     */   
/*     */   public void update(@NotNull OffsetPxNode node) {
/* 212 */     Intrinsics.checkNotNullParameter(node, "node"); node.setOffset(this.offset);
/* 213 */     node.setRtlAware(this.rtlAware);
/*     */   }
/*     */   public boolean equals(@Nullable Object other) {
/*     */     Object object;
/* 217 */     if (this == other) return true; 
/* 218 */     if (((other instanceof OffsetPxElement) ? other : null) == null) { (other instanceof OffsetPxElement) ? other : null; return false; }
/*     */     
/* 220 */     return (this.offset == ((OffsetPxElement)object).offset && 
/* 221 */       this.rtlAware == ((OffsetPxElement)object).rtlAware);
/*     */   } @NotNull
/*     */   public String toString() {
/* 224 */     return "OffsetPxModifier(offset=" + this.offset + ", rtlAware=" + this.rtlAware + ')';
/*     */   }
/*     */   public int hashCode() {
/* 227 */     int result = this.offset.hashCode();
/* 228 */     result = 31 * result + Boolean.hashCode(this.rtlAware);
/* 229 */     return result;
/*     */   }
/*     */   
/*     */   public void inspectableProperties(@NotNull InspectorInfo $this$inspectableProperties) {
/* 233 */     Intrinsics.checkNotNullParameter($this$inspectableProperties, "<this>"); this.inspectorInfo.invoke($this$inspectableProperties);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\OffsetPxElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */