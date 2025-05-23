/*    */ package ai.grazie.model.cloud.exceptions;
/*    */ 
/*    */ import ai.grazie.model.cloud.HeaderCollection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\000\n\002\020\003\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\030\0002\0020\001B+\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007\022\b\b\002\020\b\032\0020\t¢\006\002\020\nR\024\020\013\032\0020\fX\004¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Lai/grazie/model/cloud/exceptions/JsonBodyException$Unknown;", "Lai/grazie/model/cloud/exceptions/JsonBodyException;", "description", "", "status", "", "e", "", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;ILjava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "body", "Lai/grazie/model/cloud/exceptions/ExceptionBody$Unknown;", "getBody", "()Lai/grazie/model/cloud/exceptions/ExceptionBody$Unknown;", "model-cloud"})
/*    */ public final class Unknown
/*    */   extends JsonBodyException
/*    */ {
/*    */   @NotNull
/*    */   private final ExceptionBody.Unknown body;
/*    */   
/*    */   public Unknown(@NotNull String description, int status, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/* 19 */     super(description, e, status, headers, null);
/* 20 */     this.body = new ExceptionBody.Unknown(description, status); } @NotNull public ExceptionBody.Unknown getBody() { return this.body; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\exceptions\JsonBodyException$Unknown.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */