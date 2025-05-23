/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.LinkOption;
/*    */ import java.util.Arrays;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function0<Unit>
/*    */ {
/*    */   public final void invoke() {
/* 41 */     if (Files.exists(ToolFromResources.access$getErrorsPath$p(ToolFromResources.this), Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length)) && Files.size(ToolFromResources.access$getErrorsPath$p(ToolFromResources.this)) == 0L)
/* 42 */       Files.deleteIfExists(ToolFromResources.access$getErrorsPath$p(ToolFromResources.this)); 
/*    */   }
/*    */   
/*    */   null() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\ToolFromResources$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */