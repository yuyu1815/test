/*    */ package org.jetbrains.compose.resources.vector;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import kotlin.enums.EnumEntriesKt;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020!\n\002\030\002\n\002\b\004\b\002\030\0002\0020\001:\001\bB\005¢\006\002\020\002R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\006\020\007¨\006\t"}, d2 = {"Lorg/jetbrains/compose/resources/vector/BuildContext;", "", "()V", "currentGroups", "", "Lorg/jetbrains/compose/resources/vector/BuildContext$Group;", "getCurrentGroups", "()Ljava/util/List;", "Group", "library"})
/*    */ final class BuildContext
/*    */ {
/*    */   @NotNull
/* 56 */   private final List<Group> currentGroups = new ArrayList<>(); @NotNull public final List<Group> getCurrentGroups() { return this.currentGroups; }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\004\b\002\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\005"}, d2 = {"Lorg/jetbrains/compose/resources/vector/BuildContext$Group;", "", "(Ljava/lang/String;I)V", "Real", "Virtual", "library"})
/*    */   public enum Group
/*    */   {
/* 62 */     Real,
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 68 */     Virtual;
/*    */     
/*    */     @NotNull
/*    */     public static EnumEntries<Group> getEntries() {
/*    */       return $ENTRIES;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\vector\BuildContext.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */