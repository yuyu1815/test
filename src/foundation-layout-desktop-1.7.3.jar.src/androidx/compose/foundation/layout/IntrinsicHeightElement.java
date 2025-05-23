/*     */ package androidx.compose.foundation.layout;
/*     */ 
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\n\n\002\020\000\n\000\n\002\020\b\n\002\b\004\b\002\030\0002\b\022\004\022\0020\0020\001B.\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\027\020\007\032\023\022\004\022\0020\t\022\004\022\0020\n0\b¢\006\002\b\013¢\006\002\020\fJ\b\020\023\032\0020\002H\026J\023\020\024\032\0020\0062\b\020\025\032\004\030\0010\026H\002J\b\020\027\032\0020\030H\026J\020\020\031\032\0020\n2\006\020\032\032\0020\002H\026J\f\020\033\032\0020\n*\0020\tH\026R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\r\020\016R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\017\020\020R\"\020\007\032\023\022\004\022\0020\t\022\004\022\0020\n0\b¢\006\002\b\013¢\006\b\n\000\032\004\b\021\020\022¨\006\034"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/layout/IntrinsicHeightNode;", "height", "Landroidx/compose/foundation/layout/IntrinsicSize;", "enforceIncoming", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/layout/IntrinsicSize;ZLkotlin/jvm/functions/Function1;)V", "getEnforceIncoming", "()Z", "getHeight", "()Landroidx/compose/foundation/layout/IntrinsicSize;", "getInspectorInfo", "()Lkotlin/jvm/functions/Function1;", "create", "equals", "other", "", "hashCode", "", "update", "node", "inspectableProperties", "foundation-layout"})
/*     */ final class IntrinsicHeightElement
/*     */   extends ModifierNodeElement<IntrinsicHeightNode>
/*     */ {
/*     */   @NotNull
/*     */   private final IntrinsicSize height;
/*     */   private final boolean enforceIncoming;
/*     */   @NotNull
/*     */   private final Function1<InspectorInfo, Unit> inspectorInfo;
/*     */   
/*     */   @NotNull
/*     */   public final IntrinsicSize getHeight() {
/* 188 */     return this.height;
/* 189 */   } public final boolean getEnforceIncoming() { return this.enforceIncoming; } @NotNull
/* 190 */   public final Function1<InspectorInfo, Unit> getInspectorInfo() { return this.inspectorInfo; } public IntrinsicHeightElement(@NotNull IntrinsicSize height, boolean enforceIncoming, @NotNull Function1<InspectorInfo, Unit> inspectorInfo) { this.height = height; this.enforceIncoming = enforceIncoming; this.inspectorInfo = inspectorInfo; } @NotNull
/*     */   public IntrinsicHeightNode create() {
/* 192 */     return new IntrinsicHeightNode(this.height, this.enforceIncoming);
/*     */   }
/*     */   public void update(@NotNull IntrinsicHeightNode node) {
/* 195 */     Intrinsics.checkNotNullParameter(node, "node"); node.setHeight(this.height);
/* 196 */     node.setEnforceIncoming(this.enforceIncoming);
/*     */   }
/*     */   public boolean equals(@Nullable Object other) {
/*     */     Object object;
/* 200 */     if (this == other) return true; 
/* 201 */     if (((other instanceof IntrinsicHeightElement) ? other : null) == null) { (other instanceof IntrinsicHeightElement) ? other : null; return false; }
/* 202 */      return (this.height == ((IntrinsicHeightElement)object).height && 
/* 203 */       this.enforceIncoming == ((IntrinsicHeightElement)object).enforceIncoming);
/*     */   }
/*     */   public int hashCode() {
/* 206 */     return 31 * this.height.hashCode() + Boolean.hashCode(this.enforceIncoming);
/*     */   }
/*     */   public void inspectableProperties(@NotNull InspectorInfo $this$inspectableProperties) {
/* 209 */     Intrinsics.checkNotNullParameter($this$inspectableProperties, "<this>"); this.inspectorInfo.invoke($this$inspectableProperties);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\IntrinsicHeightElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */