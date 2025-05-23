/*    */ package androidx.compose.foundation.layout;
/*    */ 
/*    */ import androidx.compose.ui.layout.MeasurePolicy;
/*    */ import androidx.compose.ui.layout.MeasureResult;
/*    */ import androidx.compose.ui.layout.MeasureScope;
/*    */ import androidx.compose.ui.layout.Placeable;
/*    */ import androidx.compose.ui.unit.Constraints;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\bÂ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J,\020\003\032\0020\004*\0020\0052\f\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\nH\026ø\001\000¢\006\004\b\013\020\f\002\007\n\005\b¡\0360\001¨\006\r"}, d2 = {"Landroidx/compose/foundation/layout/SpacerMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout"})
/*    */ final class SpacerMeasurePolicy
/*    */   implements MeasurePolicy
/*    */ {
/*    */   @NotNull
/*    */   public static final SpacerMeasurePolicy INSTANCE = new SpacerMeasurePolicy();
/*    */   
/*    */   @NotNull
/*    */   public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull List measurables, long constraints) {
/* 49 */     Intrinsics.checkNotNullParameter($this$measure_u2d3p2s80s, "$this$measure"); Intrinsics.checkNotNullParameter(measurables, "measurables"); long $this$measure_3p2s80s_u24lambda_u240 = constraints; int $i$a$-with-SpacerMeasurePolicy$measure$1 = 0;
/* 50 */     int width = Constraints.getHasFixedWidth-impl($this$measure_3p2s80s_u24lambda_u240) ? Constraints.getMaxWidth-impl($this$measure_3p2s80s_u24lambda_u240) : 0;
/* 51 */     int height = Constraints.getHasFixedHeight-impl($this$measure_3p2s80s_u24lambda_u240) ? Constraints.getMaxHeight-impl($this$measure_3p2s80s_u24lambda_u240) : 0;
/* 52 */     return MeasureScope.layout$default($this$measure_u2d3p2s80s, width, height, null, SpacerMeasurePolicy$measure$1$1.INSTANCE, 4, null); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}) static final class SpacerMeasurePolicy$measure$1$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> { public final void invoke(@NotNull Placeable.PlacementScope $this$layout) { Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); }
/*    */ 
/*    */     
/*    */     public static final SpacerMeasurePolicy$measure$1$1 INSTANCE = new SpacerMeasurePolicy$measure$1$1();
/*    */     
/*    */     SpacerMeasurePolicy$measure$1$1() {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\SpacerMeasurePolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */