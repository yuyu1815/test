/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import kotlin.enums.EnumEntriesKt;
/*    */ import kotlin.jvm.internal.markers.KMappedMarker;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020(\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\003\n\002\020\b\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\020\024\n\002\b\003\bf\030\0002\b\022\004\022\0020\0020\001:\001\031J\022\020\017\032\0020\0202\b\b\002\020\021\032\0020\022H&J\t\020\023\032\0020\022H¦\002J\t\020\024\032\0020\002H¦\002J\032\020\024\032\0020\0252\006\020\026\032\0020\0272\b\b\002\020\030\032\0020\020H&R\022\020\003\032\0020\004X¦\004¢\006\006\032\004\b\005\020\006R\022\020\007\032\0020\bX¦\004¢\006\006\032\004\b\t\020\nR\022\020\013\032\0020\fX¦\004¢\006\006\032\004\b\r\020\016ø\001\000\002\006\n\004\b!0\001¨\006\032À\006\001"}, d2 = {"Landroidx/compose/ui/graphics/PathIterator;", "", "Landroidx/compose/ui/graphics/PathSegment;", "conicEvaluation", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "getConicEvaluation", "()Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "path", "Landroidx/compose/ui/graphics/Path;", "getPath", "()Landroidx/compose/ui/graphics/Path;", "tolerance", "", "getTolerance", "()F", "calculateSize", "", "includeConvertedConics", "", "hasNext", "next", "Landroidx/compose/ui/graphics/PathSegment$Type;", "outPoints", "", "offset", "ConicEvaluation", "ui-graphics"})
/*    */ public interface PathIterator
/*    */   extends Iterator<PathSegment>, KMappedMarker
/*    */ {
/*    */   @NotNull
/*    */   Path getPath();
/*    */   
/*    */   @NotNull
/*    */   ConicEvaluation getConicEvaluation();
/*    */   
/*    */   float getTolerance();
/*    */   
/*    */   int calculateSize(boolean paramBoolean);
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\004\b\002\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\005"}, d2 = {"Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "", "(Ljava/lang/String;I)V", "AsConic", "AsQuadratics", "ui-graphics"})
/*    */   public enum ConicEvaluation
/*    */   {
/* 61 */     AsConic,
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 67 */     AsQuadratics;
/*    */     
/*    */     @NotNull
/*    */     public static EnumEntries<ConicEvaluation> getEntries() {
/*    */       return $ENTRIES;
/*    */     }
/*    */   }
/*    */   
/*    */   boolean hasNext();
/*    */   
/*    */   @NotNull
/*    */   PathSegment.Type next(@NotNull float[] paramArrayOffloat, int paramInt);
/*    */   
/*    */   @NotNull
/*    */   PathSegment next();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\PathIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */