/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.node.ModifierNodeElement;
/*     */ import androidx.compose.ui.platform.InspectorInfo;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\n\n\002\020\000\n\000\n\002\020\b\n\002\b\004\b\002\030\0002\b\022\004\022\0020\0020\001B.\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\027\020\007\032\023\022\004\022\0020\t\022\004\022\0020\n0\b¢\006\002\b\013¢\006\002\020\fJ\b\020\023\032\0020\002H\026J\023\020\024\032\0020\0062\b\020\025\032\004\030\0010\026H\002J\b\020\027\032\0020\030H\026J\020\020\031\032\0020\n2\006\020\032\032\0020\002H\026J\f\020\033\032\0020\n*\0020\tH\026R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\r\020\016R\"\020\007\032\023\022\004\022\0020\t\022\004\022\0020\n0\b¢\006\002\b\013¢\006\b\n\000\032\004\b\017\020\020R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\021\020\022¨\006\034"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/BoxChildDataNode;", "alignment", "Landroidx/compose/ui/Alignment;", "matchParentSize", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function1;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "getMatchParentSize", "()Z", "create", "equals", "other", "", "hashCode", "", "update", "node", "inspectableProperties", "foundation-layout"})
/*     */ final class BoxChildDataElement
/*     */   extends ModifierNodeElement<BoxChildDataNode>
/*     */ {
/*     */   @NotNull
/*     */   private final Alignment alignment;
/*     */   private final boolean matchParentSize;
/*     */   @NotNull
/*     */   private final Function1<InspectorInfo, Unit> inspectorInfo;
/*     */   
/*     */   @NotNull
/*     */   public final Alignment getAlignment() {
/* 301 */     return this.alignment;
/* 302 */   } public final boolean getMatchParentSize() { return this.matchParentSize; } @NotNull
/* 303 */   public final Function1<InspectorInfo, Unit> getInspectorInfo() { return this.inspectorInfo; } public BoxChildDataElement(@NotNull Alignment alignment, boolean matchParentSize, @NotNull Function1<InspectorInfo, Unit> inspectorInfo) { this.alignment = alignment; this.matchParentSize = matchParentSize; this.inspectorInfo = inspectorInfo; }
/*     */   
/*     */   @NotNull
/*     */   public BoxChildDataNode create() {
/* 307 */     return new BoxChildDataNode(this.alignment, this.matchParentSize);
/*     */   }
/*     */   
/*     */   public void update(@NotNull BoxChildDataNode node) {
/* 311 */     Intrinsics.checkNotNullParameter(node, "node"); node.setAlignment(this.alignment);
/* 312 */     node.setMatchParentSize(this.matchParentSize);
/*     */   }
/*     */   
/*     */   public void inspectableProperties(@NotNull InspectorInfo $this$inspectableProperties) {
/* 316 */     Intrinsics.checkNotNullParameter($this$inspectableProperties, "<this>"); this.inspectorInfo.invoke($this$inspectableProperties);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 320 */     int result = this.alignment.hashCode();
/* 321 */     result = 31 * result + Boolean.hashCode(this.matchParentSize);
/* 322 */     return result;
/*     */   }
/*     */   public boolean equals(@Nullable Object other) {
/*     */     Object object;
/* 326 */     if (this == other) return true; 
/* 327 */     if (((other instanceof BoxChildDataElement) ? other : null) == null) { (other instanceof BoxChildDataElement) ? other : null; return false; }
/* 328 */      return (Intrinsics.areEqual(this.alignment, ((BoxChildDataElement)object).alignment) && 
/* 329 */       this.matchParentSize == ((BoxChildDataElement)object).matchParentSize);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\BoxChildDataElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */