/*    */ package ai.grazie.model.cloud.exceptions;
/*    */ 
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\004\b\027\030\0002\0060\001j\002`\002B\033\022\b\020\003\032\004\030\0010\004\022\n\b\002\020\005\032\004\030\0010\006¢\006\002\020\007R\023\020\003\032\004\030\0010\004¢\006\b\n\000\032\004\b\b\020\t¨\006\n"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPConnectionError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "description", "", "e", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getDescription", "()Ljava/lang/String;", "model-cloud"})
/*    */ public class HTTPConnectionError extends RuntimeException {
/*    */   @Nullable
/*    */   private final String description;
/*    */   
/* 10 */   public HTTPConnectionError(@Nullable String description, @Nullable Throwable e) { super(description, e); this.description = description; } @Nullable public final String getDescription() { return this.description; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\exceptions\HTTPConnectionError.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */