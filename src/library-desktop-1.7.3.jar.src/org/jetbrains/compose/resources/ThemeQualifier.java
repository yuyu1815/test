/*    */ package org.jetbrains.compose.resources;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import kotlin.enums.EnumEntriesKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @InternalResourceApi
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\020\020\n\002\030\002\n\002\b\005\b\002\030\000 \0062\b\022\004\022\0020\0000\0012\0020\002:\001\006B\007\b\002¢\006\002\020\003j\002\b\004j\002\b\005¨\006\007"}, d2 = {"Lorg/jetbrains/compose/resources/ThemeQualifier;", "", "Lorg/jetbrains/compose/resources/Qualifier;", "(Ljava/lang/String;I)V", "LIGHT", "DARK", "Companion", "library"})
/*    */ public enum ThemeQualifier
/*    */   implements Qualifier
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   
/*    */   @NotNull
/*    */   public static EnumEntries<ThemeQualifier> getEntries() {
/*    */     return $ENTRIES;
/*    */   }
/*    */   
/* 51 */   LIGHT,
/* 52 */   DARK; static { Companion = new Companion(null); }
/*    */    @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lorg/jetbrains/compose/resources/ThemeQualifier$Companion;", "", "()V", "selectByValue", "Lorg/jetbrains/compose/resources/ThemeQualifier;", "isDark", "", "library"})
/*    */   public static final class Companion { @NotNull
/*    */     public final ThemeQualifier selectByValue(boolean isDark) {
/* 56 */       return isDark ? ThemeQualifier.DARK : ThemeQualifier.LIGHT;
/*    */     }
/*    */     
/*    */     private Companion() {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ThemeQualifier.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */