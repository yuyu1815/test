/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.AlignmentLine;
/*     */ import androidx.compose.ui.node.ModifierNodeElement;
/*     */ import androidx.compose.ui.platform.InspectorInfo;
/*     */ import androidx.compose.ui.unit.TextUnit;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\004\b\002\030\0002\b\022\004\022\0020\0020\001B6\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\006\022\027\020\b\032\023\022\004\022\0020\n\022\004\022\0020\0130\t¢\006\002\b\f¢\006\002\020\rJ\b\020\026\032\0020\002H\026J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\032H\002J\b\020\033\032\0020\034H\026J\020\020\035\032\0020\0132\006\020\036\032\0020\002H\026J\f\020\037\032\0020\013*\0020\nH\026R\031\020\007\032\0020\006ø\001\000ø\001\001¢\006\n\n\002\020\020\032\004\b\016\020\017R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\021\020\022R\031\020\005\032\0020\006ø\001\000ø\001\001¢\006\n\n\002\020\020\032\004\b\023\020\017R\"\020\b\032\023\022\004\022\0020\n\022\004\022\0020\0130\t¢\006\002\b\f¢\006\b\n\000\032\004\b\024\020\025\002\013\n\005\b¡\0360\001\n\002\b!¨\006 "}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitNode;", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "before", "Landroidx/compose/ui/unit/TextUnit;", "after", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/layout/AlignmentLine;JJLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAfter-XSAIIZE", "()J", "J", "getAlignmentLine", "()Landroidx/compose/ui/layout/AlignmentLine;", "getBefore-XSAIIZE", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "create", "equals", "", "other", "", "hashCode", "", "update", "node", "inspectableProperties", "foundation-layout"})
/*     */ final class AlignmentLineOffsetTextUnitElement
/*     */   extends ModifierNodeElement<AlignmentLineOffsetTextUnitNode>
/*     */ {
/*     */   @NotNull
/*     */   private final AlignmentLine alignmentLine;
/*     */   private final long before;
/*     */   private final long after;
/*     */   @NotNull
/*     */   private final Function1<InspectorInfo, Unit> inspectorInfo;
/*     */   
/*     */   @NotNull
/*     */   public final AlignmentLine getAlignmentLine() {
/* 256 */     return this.alignmentLine;
/* 257 */   } public final long getBefore-XSAIIZE() { return this.before; }
/* 258 */   public final long getAfter-XSAIIZE() { return this.after; } @NotNull
/* 259 */   public final Function1<InspectorInfo, Unit> getInspectorInfo() { return this.inspectorInfo; } private AlignmentLineOffsetTextUnitElement(AlignmentLine alignmentLine, long before, long after, Function1<InspectorInfo, Unit> inspectorInfo) { this.alignmentLine = alignmentLine; this.before = before; this.after = after; this.inspectorInfo = inspectorInfo; }
/*     */    @NotNull
/*     */   public AlignmentLineOffsetTextUnitNode create() {
/* 262 */     return new AlignmentLineOffsetTextUnitNode(
/* 263 */         this.alignmentLine, 
/* 264 */         this.before, 
/* 265 */         this.after, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 270 */     int result = this.alignmentLine.hashCode();
/* 271 */     result = 31 * result + TextUnit.hashCode-impl(this.before);
/* 272 */     result = 31 * result + TextUnit.hashCode-impl(this.after);
/* 273 */     return result;
/*     */   }
/*     */   public boolean equals(@Nullable Object other) {
/*     */     Object object;
/* 277 */     if (this == other) return true; 
/* 278 */     if (((other instanceof AlignmentLineOffsetTextUnitElement) ? other : null) == null) { (other instanceof AlignmentLineOffsetTextUnitElement) ? other : null; return false; }
/*     */     
/* 280 */     return (Intrinsics.areEqual(this.alignmentLine, ((AlignmentLineOffsetTextUnitElement)object).alignmentLine) && 
/* 281 */       TextUnit.equals-impl0(this.before, ((AlignmentLineOffsetTextUnitElement)object).before) && 
/* 282 */       TextUnit.equals-impl0(this.after, ((AlignmentLineOffsetTextUnitElement)object).after));
/*     */   }
/*     */   
/*     */   public void inspectableProperties(@NotNull InspectorInfo $this$inspectableProperties) {
/* 286 */     Intrinsics.checkNotNullParameter($this$inspectableProperties, "<this>"); this.inspectorInfo.invoke($this$inspectableProperties);
/*     */   }
/*     */   
/*     */   public void update(@NotNull AlignmentLineOffsetTextUnitNode node) {
/* 290 */     Intrinsics.checkNotNullParameter(node, "node"); node.setAlignmentLine(this.alignmentLine);
/* 291 */     node.setBefore--R2X_6o(this.before);
/* 292 */     node.setAfter--R2X_6o(this.after);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\AlignmentLineOffsetTextUnitElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */