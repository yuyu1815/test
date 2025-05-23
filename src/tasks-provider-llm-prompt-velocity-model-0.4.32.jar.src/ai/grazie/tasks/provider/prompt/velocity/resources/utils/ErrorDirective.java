/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.utils;
/*    */ 
/*    */ import ai.grazie.tasks.provider.prompt.velocity.resources.model.VelocityParameterException;
/*    */ import java.io.Writer;
/*    */ import kotlin.Metadata;
/*    */ import org.apache.velocity.context.InternalContextAdapter;
/*    */ import org.apache.velocity.runtime.directive.Directive;
/*    */ import org.apache.velocity.runtime.parser.node.Node;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\020\b\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\026\030\0002\0020\001B\007¢\006\004\b\002\020\003J\n\020\004\032\004\030\0010\005H\026J\b\020\006\032\0020\007H\026J&\020\b\032\0020\t2\b\020\n\032\004\030\0010\0132\b\020\f\032\004\030\0010\r2\b\020\016\032\004\030\0010\017H\026¨\006\020"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/utils/ErrorDirective;", "Lorg/apache/velocity/runtime/directive/Directive;", "<init>", "()V", "getName", "", "getType", "", "render", "", "context", "Lorg/apache/velocity/context/InternalContextAdapter;", "writer", "Ljava/io/Writer;", "node", "Lorg/apache/velocity/runtime/parser/node/Node;", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public class ErrorDirective extends Directive {
/*    */   @NotNull
/* 14 */   public Object clone() { return super.clone(); } @Nullable
/*    */   public String getName() {
/* 16 */     return "error";
/*    */   }
/*    */   
/*    */   public int getType() {
/* 20 */     return 2;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean render(@Nullable InternalContextAdapter context, @Nullable Writer writer, @Nullable Node node) {
/* 28 */     if (node == null) return false;
/*    */     
/* 30 */     if (node.jjtGetNumChildren() == 0) {
/* 31 */       this.log.error("#error requires at least one argument");
/* 32 */       throw new IllegalStateException("#error requires at least one argument");
/*    */     } 
/*    */     
/* 35 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$render_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-ErrorDirective$render$message$1 = 0;
/* 36 */     if (node.jjtGetNumChildren() == 1) {
/* 37 */       Object messageObj = node.jjtGetChild(0).value(context);
/* 38 */       if (messageObj != null) {
/* 39 */         $this$render_u24lambda_u240.append(messageObj.toString());
/*    */       }
/*    */     } else {
/* 42 */       $this$render_u24lambda_u240.append("Error");
/*    */     } 
/* 44 */     if (context == null || context.getCurrentTemplateName() == null) context.getCurrentTemplateName();  context.getCurrentTemplateName().append("unknown template")
/* 45 */       .append(" line ").append(node.getLine())
/* 46 */       .append(", column ").append(node.getColumn());
/*    */     
/*    */     String message = stringBuilder1.toString();
/* 49 */     this.log.warn(message);
/* 50 */     throw new VelocityParameterException(message, null, 2, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resource\\utils\ErrorDirective.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */