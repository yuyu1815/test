/*    */ package androidx.compose.runtime.tooling;
/*    */ 
/*    */ import androidx.compose.runtime.CompositionLocalKt;
/*    */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\020#\n\002\030\002\n\002\b\003\"\037\020\000\032\020\022\f\022\n\022\004\022\0020\003\030\0010\0020\001¢\006\b\n\000\032\004\b\004\020\005¨\006\006"}, d2 = {"LocalInspectionTables", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "Landroidx/compose/runtime/tooling/CompositionData;", "getLocalInspectionTables", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime"})
/*    */ public final class InspectionTablesKt
/*    */ {
/*    */   @NotNull
/* 24 */   private static final ProvidableCompositionLocal<Set<CompositionData>> LocalInspectionTables = CompositionLocalKt.staticCompositionLocalOf(InspectionTablesKt$LocalInspectionTables$1.INSTANCE); @NotNull public static final ProvidableCompositionLocal<Set<CompositionData>> getLocalInspectionTables() { return LocalInspectionTables; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020#\n\002\030\002\n\000\020\000\032\n\022\004\022\0020\002\030\0010\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/tooling/CompositionData;", "invoke"}) static final class InspectionTablesKt$LocalInspectionTables$1 extends Lambda implements Function0<Set<CompositionData>> { @Nullable public final Set<CompositionData> invoke() { return null; }
/*    */ 
/*    */     
/*    */     public static final InspectionTablesKt$LocalInspectionTables$1 INSTANCE = new InspectionTablesKt$LocalInspectionTables$1();
/*    */     
/*    */     InspectionTablesKt$LocalInspectionTables$1() {
/*    */       super(0);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\tooling\InspectionTablesKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */