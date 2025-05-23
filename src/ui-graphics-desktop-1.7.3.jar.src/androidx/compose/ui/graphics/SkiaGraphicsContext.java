/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import androidx.compose.runtime.snapshots.SnapshotStateObserver;
/*    */ import androidx.compose.ui.InternalComposeUiApi;
/*    */ import androidx.compose.ui.graphics.layer.GraphicsLayer;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\003\b\007\030\0002\0020\001B\005¢\006\002\020\002J\b\020\n\032\0020\013H\026J\006\020\f\032\0020\rJ\020\020\016\032\0020\r2\006\020\017\032\0020\013H\026R\036\020\005\032\0020\0042\006\020\003\032\0020\004@BX\016¢\006\b\n\000\032\004\b\006\020\007R\016\020\b\032\0020\tX\004¢\006\002\n\000¨\006\020"}, d2 = {"Landroidx/compose/ui/graphics/SkiaGraphicsContext;", "Landroidx/compose/ui/graphics/GraphicsContext;", "()V", "<set-?>", "", "activeGraphicsLayersCount", "getActiveGraphicsLayersCount", "()I", "snapshotObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "createGraphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "dispose", "", "releaseGraphicsLayer", "layer", "ui-graphics"})
/*    */ @InternalComposeUiApi
/*    */ public final class SkiaGraphicsContext
/*    */   implements GraphicsContext
/*    */ {
/*    */   @NotNull
/*    */   private final SnapshotStateObserver snapshotObserver;
/*    */   
/*    */   public SkiaGraphicsContext() {
/* 25 */     this.snapshotObserver = new SnapshotStateObserver(SkiaGraphicsContext$snapshotObserver$1.INSTANCE);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     this.snapshotObserver.start();
/*    */   }
/*    */   private int activeGraphicsLayersCount;
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0010\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "command", "Lkotlin/Function0;", "invoke"}) static final class SkiaGraphicsContext$snapshotObserver$1 extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
/* 38 */     public static final SkiaGraphicsContext$snapshotObserver$1 INSTANCE = new SkiaGraphicsContext$snapshotObserver$1(); public final void invoke(@NotNull Function0 command) { Intrinsics.checkNotNullParameter(command, "command"); command.invoke(); } SkiaGraphicsContext$snapshotObserver$1() { super(1); } } public final int getActiveGraphicsLayersCount() { return this.activeGraphicsLayersCount; } public final void dispose() { this.snapshotObserver.stop();
/* 39 */     this.snapshotObserver.clear(); }
/*    */   
/*    */   @NotNull
/*    */   public GraphicsLayer createGraphicsLayer() {
/* 43 */     int i = this.activeGraphicsLayersCount; this.activeGraphicsLayersCount = i + 1;
/* 44 */     return new GraphicsLayer(this.snapshotObserver);
/*    */   }
/*    */   
/*    */   public void releaseGraphicsLayer(@NotNull GraphicsLayer layer) {
/* 48 */     Intrinsics.checkNotNullParameter(layer, "layer"); if (!layer.isReleased()) {
/* 49 */       int i = this.activeGraphicsLayersCount; this.activeGraphicsLayersCount = i + -1;
/* 50 */       layer.release$ui_graphics();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaGraphicsContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */