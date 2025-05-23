/*    */ package androidx.compose.ui.text;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
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
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\nH\002J\b\020\013\032\0020\fH\026J\b\020\r\032\0020\003H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\016"}, d2 = {"Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "Landroidx/compose/ui/text/TtsAnnotation;", "verbatim", "", "(Ljava/lang/String;)V", "getVerbatim", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "ui-text"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class VerbatimTtsAnnotation
/*    */   extends TtsAnnotation
/*    */ {
/*    */   @NotNull
/*    */   private final String verbatim;
/*    */   public static final int $stable;
/*    */   
/*    */   @NotNull
/*    */   public final String getVerbatim() {
/* 32 */     return this.verbatim;
/* 33 */   } public VerbatimTtsAnnotation(@NotNull String verbatim) { super(null);
/*    */     this.verbatim = verbatim; } public boolean equals(@Nullable Object other) {
/* 35 */     if (this == other) return true; 
/* 36 */     if (!(other instanceof VerbatimTtsAnnotation)) return false; 
/* 37 */     if (!Intrinsics.areEqual(this.verbatim, ((VerbatimTtsAnnotation)other).verbatim)) return false; 
/* 38 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 42 */     return this.verbatim.hashCode();
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 46 */     return "VerbatimTtsAnnotation(verbatim=" + this.verbatim + ')';
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\VerbatimTtsAnnotation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */