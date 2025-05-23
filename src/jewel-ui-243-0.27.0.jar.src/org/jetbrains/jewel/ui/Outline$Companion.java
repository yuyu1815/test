/*    */ package org.jetbrains.jewel.ui;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\007¨\006\t"}, d2 = {"Lorg/jetbrains/jewel/ui/Outline$Companion;", "", "<init>", "()V", "of", "Lorg/jetbrains/jewel/ui/Outline;", "warning", "", "error", "ui"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final Outline of(boolean warning, boolean error) {
/* 20 */     return 
/* 21 */       error ? Outline.Error : (
/* 22 */       warning ? Outline.Warning : 
/* 23 */       Outline.None);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\Outline$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */