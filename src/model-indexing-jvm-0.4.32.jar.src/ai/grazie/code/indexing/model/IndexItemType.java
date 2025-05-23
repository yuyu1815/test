/*    */ package ai.grazie.code.indexing.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\013\b\001\030\0002\b\022\004\022\0020\0000\001B\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\r¨\006\016"}, d2 = {"Lai/grazie/code/indexing/model/IndexItemType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FILES", "CLASSES", "METHODS", "PROPERTIES", "CHUNKS", "FILE_MAP", "SUMMARY", "model-indexing"})
/*    */ public enum IndexItemType {
/*  8 */   FILES("files"),
/*  9 */   CLASSES("classes"),
/* 10 */   METHODS("methods"),
/* 11 */   PROPERTIES("properties"),
/* 12 */   CHUNKS("chunks"),
/* 13 */   FILE_MAP("file_map"),
/* 14 */   SUMMARY("summary");
/*    */   @NotNull
/*    */   private final String value;
/*    */   
/*    */   IndexItemType(String value) {
/*    */     this.value = value;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getValue() {
/*    */     return this.value;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\IndexItemType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */