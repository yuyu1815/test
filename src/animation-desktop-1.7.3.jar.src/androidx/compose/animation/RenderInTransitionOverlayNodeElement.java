/*    */ package androidx.compose.animation;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.graphics.Path;
/*    */ import androidx.compose.ui.node.ModifierNodeElement;
/*    */ import androidx.compose.ui.platform.InspectorInfo;
/*    */ import androidx.compose.ui.unit.Density;
/*    */ import androidx.compose.ui.unit.LayoutDirection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\000\n\002\020\007\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\025\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\b\b\030\0002\b\022\004\022\0020\0020\001B?\022\006\020\003\032\0020\004\022\f\020\005\032\b\022\004\022\0020\0070\006\022\006\020\b\032\0020\t\022\032\020\n\032\026\022\004\022\0020\f\022\004\022\0020\r\022\006\022\004\030\0010\0160\013¢\006\002\020\017J\t\020\034\032\0020\004HÆ\003J\017\020\035\032\b\022\004\022\0020\0070\006HÆ\003J\t\020\036\032\0020\tHÆ\003J\035\020\037\032\026\022\004\022\0020\f\022\004\022\0020\r\022\006\022\004\030\0010\0160\013HÆ\003JK\020 \032\0020\0002\b\b\002\020\003\032\0020\0042\016\b\002\020\005\032\b\022\004\022\0020\0070\0062\b\b\002\020\b\032\0020\t2\034\b\002\020\n\032\026\022\004\022\0020\f\022\004\022\0020\r\022\006\022\004\030\0010\0160\013HÆ\001J\b\020!\032\0020\002H\026J\023\020\"\032\0020\0072\b\020#\032\004\030\0010$H\002J\b\020%\032\0020&H\026J\t\020'\032\0020(HÖ\001J\020\020)\032\0020*2\006\020+\032\0020\002H\026J\f\020,\032\0020**\0020-H\026R%\020\n\032\026\022\004\022\0020\f\022\004\022\0020\r\022\006\022\004\030\0010\0160\013¢\006\b\n\000\032\004\b\020\020\021R \020\005\032\b\022\004\022\0020\0070\006X\016¢\006\016\n\000\032\004\b\022\020\023\"\004\b\024\020\025R\032\020\003\032\0020\004X\016¢\006\016\n\000\032\004\b\026\020\027\"\004\b\030\020\031R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\032\020\033¨\006."}, d2 = {"Landroidx/compose/animation/RenderInTransitionOverlayNodeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/RenderInTransitionOverlayNode;", "sharedTransitionScope", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "renderInOverlay", "Lkotlin/Function0;", "", "zIndexInOverlay", "", "clipInOverlay", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "(Landroidx/compose/animation/SharedTransitionScopeImpl;Lkotlin/jvm/functions/Function0;FLkotlin/jvm/functions/Function2;)V", "getClipInOverlay", "()Lkotlin/jvm/functions/Function2;", "getRenderInOverlay", "()Lkotlin/jvm/functions/Function0;", "setRenderInOverlay", "(Lkotlin/jvm/functions/Function0;)V", "getSharedTransitionScope", "()Landroidx/compose/animation/SharedTransitionScopeImpl;", "setSharedTransitionScope", "(Landroidx/compose/animation/SharedTransitionScopeImpl;)V", "getZIndexInOverlay", "()F", "component1", "component2", "component3", "component4", "copy", "create", "equals", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "animation"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class RenderInTransitionOverlayNodeElement
/*    */   extends ModifierNodeElement<RenderInTransitionOverlayNode>
/*    */ {
/*    */   @NotNull
/*    */   private SharedTransitionScopeImpl sharedTransitionScope;
/*    */   @NotNull
/*    */   private Function0<Boolean> renderInOverlay;
/*    */   private final float zIndexInOverlay;
/*    */   @NotNull
/*    */   private final Function2<LayoutDirection, Density, Path> clipInOverlay;
/*    */   public static final int $stable;
/*    */   
/*    */   @NotNull
/*    */   public final SharedTransitionScopeImpl getSharedTransitionScope() {
/* 44 */     return this.sharedTransitionScope; } public final void setSharedTransitionScope(@NotNull SharedTransitionScopeImpl <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.sharedTransitionScope = <set-?>; } @NotNull
/* 45 */   public final Function0<Boolean> getRenderInOverlay() { return this.renderInOverlay; } public final void setRenderInOverlay(@NotNull Function0<Boolean> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.renderInOverlay = <set-?>; }
/* 46 */   public final float getZIndexInOverlay() { return this.zIndexInOverlay; } @NotNull
/* 47 */   public final Function2<LayoutDirection, Density, Path> getClipInOverlay() { return this.clipInOverlay; } public RenderInTransitionOverlayNodeElement(@NotNull SharedTransitionScopeImpl sharedTransitionScope, @NotNull Function0<Boolean> renderInOverlay, float zIndexInOverlay, @NotNull Function2<LayoutDirection, Density, Path> clipInOverlay) { this.sharedTransitionScope = sharedTransitionScope; this.renderInOverlay = renderInOverlay; this.zIndexInOverlay = zIndexInOverlay; this.clipInOverlay = clipInOverlay; }
/*    */    @NotNull
/*    */   public RenderInTransitionOverlayNode create() {
/* 50 */     return new RenderInTransitionOverlayNode(
/* 51 */         this.sharedTransitionScope, this.renderInOverlay, this.zIndexInOverlay, this.clipInOverlay);
/*    */   }
/*    */ 
/*    */   
/*    */   public void update(@NotNull RenderInTransitionOverlayNode node) {
/* 56 */     Intrinsics.checkNotNullParameter(node, "node"); node.setSharedScope(this.sharedTransitionScope);
/* 57 */     node.setRenderInOverlay(this.renderInOverlay);
/* 58 */     node.setZIndexInOverlay(this.zIndexInOverlay);
/* 59 */     node.setClipInOverlay(this.clipInOverlay);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 63 */     return ((this.sharedTransitionScope.hashCode() * 31 + this.renderInOverlay.hashCode()) * 31 + 
/* 64 */       Float.hashCode(this.zIndexInOverlay)) * 31 + this.clipInOverlay.hashCode();
/*    */   }
/*    */   public boolean equals(@Nullable Object other) {
/* 67 */     if (other instanceof RenderInTransitionOverlayNodeElement) {
/* 68 */       return (Intrinsics.areEqual(this.sharedTransitionScope, ((RenderInTransitionOverlayNodeElement)other).sharedTransitionScope) && 
/* 69 */         this.renderInOverlay == ((RenderInTransitionOverlayNodeElement)other).renderInOverlay && (
/* 70 */         (this.zIndexInOverlay == ((RenderInTransitionOverlayNodeElement)other).zIndexInOverlay)) && 
/* 71 */         this.clipInOverlay == ((RenderInTransitionOverlayNodeElement)other).clipInOverlay);
/*    */     }
/* 73 */     return false;
/*    */   }
/*    */   
/*    */   public void inspectableProperties(@NotNull InspectorInfo $this$inspectableProperties) {
/* 77 */     Intrinsics.checkNotNullParameter($this$inspectableProperties, "<this>"); $this$inspectableProperties.setName("renderInSharedTransitionOverlay");
/* 78 */     $this$inspectableProperties.getProperties().set("sharedTransitionScope", this.sharedTransitionScope);
/* 79 */     $this$inspectableProperties.getProperties().set("renderInOverlay", this.renderInOverlay);
/* 80 */     $this$inspectableProperties.getProperties().set("zIndexInOverlay", Float.valueOf(this.zIndexInOverlay));
/* 81 */     $this$inspectableProperties.getProperties().set("clipInOverlayDuringTransition", this.clipInOverlay);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SharedTransitionScopeImpl component1() {
/*    */     return this.sharedTransitionScope;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function0<Boolean> component2() {
/*    */     return this.renderInOverlay;
/*    */   }
/*    */   
/*    */   public final float component3() {
/*    */     return this.zIndexInOverlay;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function2<LayoutDirection, Density, Path> component4() {
/*    */     return this.clipInOverlay;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final RenderInTransitionOverlayNodeElement copy(@NotNull SharedTransitionScopeImpl sharedTransitionScope, @NotNull Function0<Boolean> renderInOverlay, float zIndexInOverlay, @NotNull Function2<? super LayoutDirection, ? super Density, ? extends Path> clipInOverlay) {
/*    */     Intrinsics.checkNotNullParameter(sharedTransitionScope, "sharedTransitionScope");
/*    */     Intrinsics.checkNotNullParameter(renderInOverlay, "renderInOverlay");
/*    */     Intrinsics.checkNotNullParameter(clipInOverlay, "clipInOverlay");
/*    */     return new RenderInTransitionOverlayNodeElement(sharedTransitionScope, renderInOverlay, zIndexInOverlay, clipInOverlay);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "RenderInTransitionOverlayNodeElement(sharedTransitionScope=" + this.sharedTransitionScope + ", renderInOverlay=" + this.renderInOverlay + ", zIndexInOverlay=" + this.zIndexInOverlay + ", clipInOverlay=" + this.clipInOverlay + ')';
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\RenderInTransitionOverlayNodeElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */