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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\003\n\000\n\002\030\002\n\002\b\003\b&\030\000 \0132\0020\001:\001\013B-\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\007\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\f"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "status", "", "description", "", "e", "", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(ILjava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "Companion", "model-cloud"})
/*    */ public abstract class AccessProhibited
/*    */   extends HTTPStatusException
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   public AccessProhibited(int status, @Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/* 25 */     super(status, description, e, headers);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited$Companion;", "", "()V", "model-cloud"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\exceptions\HTTPStatusException$AccessProhibited.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */