/*    */ package ai.grazie.model.task.library.v2.code.fleet;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskSchemaDescriptor;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R0\020\003\032\036\022\032\022\030\022\004\022\0020\006\022\004\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022R\021\020\023\032\0020\020¢\006\b\n\000\032\004\b\024\020\022R\021\020\025\032\0020\020¢\006\b\n\000\032\004\b\026\020\022¨\006\027"}, d2 = {"Lai/grazie/model/task/library/v2/code/fleet/FleetGenerateDocumentationTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "Lai/grazie/utils/attributes/Attributes$Value$Text;", "", "getAll", "()Ljava/util/List;", "context", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getContext", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "documentationToRewrite", "Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "getDocumentationToRewrite", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "language", "getLanguage", "objectName", "getObjectName", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 30 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text context = new AttributeDescriptor.Text("context"); @NotNull public final AttributeDescriptor.Text getContext() { return context; } @NotNull
/* 31 */   private static final AttributeDescriptor.OptText documentationToRewrite = new AttributeDescriptor.OptText("documentationToRewrite"); @NotNull public final AttributeDescriptor.OptText getDocumentationToRewrite() { return documentationToRewrite; } @NotNull
/* 32 */   private static final AttributeDescriptor.OptText objectName = new AttributeDescriptor.OptText("objectName"); @NotNull public final AttributeDescriptor.OptText getObjectName() { return objectName; } @NotNull
/* 33 */   private static final AttributeDescriptor.OptText language = new AttributeDescriptor.OptText("language"); @NotNull public final AttributeDescriptor.OptText getLanguage() { return language; } @NotNull
/*    */   private static final List<AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, ? extends String>> all; @NotNull
/* 35 */   public List<AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, ? extends String>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[4]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)context; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)documentationToRewrite; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)objectName; arrayOfAttributeDescriptor[3] = (AttributeDescriptor)language; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\code\fleet\FleetGenerateDocumentationTask$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */