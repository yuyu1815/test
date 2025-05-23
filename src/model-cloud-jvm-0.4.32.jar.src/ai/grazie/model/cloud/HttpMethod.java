/*    */ package ai.grazie.model.cloud;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\013\b\001\030\0002\b\022\004\022\0020\0000\001B\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\r¨\006\016"}, d2 = {"Lai/grazie/model/cloud/HttpMethod;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Get", "Post", "Put", "Patch", "Delete", "Head", "Options", "model-cloud"})
/*    */ public enum HttpMethod
/*    */ {
/*  9 */   Get("GET"),
/* 10 */   Post("POST"),
/* 11 */   Put("PUT"),
/* 12 */   Patch("PATCH"),
/* 13 */   Delete("DELETE"),
/* 14 */   Head("HEAD"),
/* 15 */   Options("OPTIONS");
/*    */   @NotNull
/*    */   private final String value;
/*    */   
/*    */   HttpMethod(String value) {
/*    */     this.value = value;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getValue() {
/*    */     return this.value;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\HttpMethod.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */