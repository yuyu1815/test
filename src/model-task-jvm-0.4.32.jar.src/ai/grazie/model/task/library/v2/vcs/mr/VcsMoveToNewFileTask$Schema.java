/*    */ package ai.grazie.model.task.library.v2.vcs.mr;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskSchemaDescriptor;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\r\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\013R\021\020\016\032\0020\005¢\006\b\n\000\032\004\b\017\020\013R\021\020\020\032\0020\005¢\006\b\n\000\032\004\b\021\020\013¨\006\022"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/mr/VcsMoveToNewFileTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll$annotations", "getAll", "()Ljava/util/List;", "codeFragment", "getCodeFragment", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "comment", "getComment", "fileText", "getFileText", "output", "getOutput", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 27 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text comment = new AttributeDescriptor.Text("comment"); @NotNull public final AttributeDescriptor.Text getComment() { return comment; } @NotNull
/* 28 */   private static final AttributeDescriptor.Text codeFragment = new AttributeDescriptor.Text("codeFragment"); @NotNull public final AttributeDescriptor.Text getCodeFragment() { return codeFragment; } @NotNull
/* 29 */   private static final AttributeDescriptor.Text fileText = new AttributeDescriptor.Text("fileText"); @NotNull public final AttributeDescriptor.Text getFileText() { return fileText; } @NotNull
/* 30 */   private static final AttributeDescriptor.Text output = new AttributeDescriptor.Text("output"); @NotNull public final AttributeDescriptor.Text getOutput() { return output; } @NotNull
/*    */   private static final List<AttributeDescriptor.Text> all; @NotNull
/*    */   public List<AttributeDescriptor.Text> getAll() {
/* 33 */     return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[4]; arrayOfText[0] = comment; arrayOfText[1] = codeFragment; arrayOfText[2] = fileText; arrayOfText[3] = output; all = CollectionsKt.listOf((Object[])arrayOfText); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\vcs\mr\VcsMoveToNewFileTask$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */