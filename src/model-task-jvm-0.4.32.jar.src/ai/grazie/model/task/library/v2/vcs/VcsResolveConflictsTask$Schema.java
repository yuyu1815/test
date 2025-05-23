/*    */ package ai.grazie.model.task.library.v2.vcs;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R2\020\003\032 \022\034\022\032\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\006\b\001\022\0020\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\f¢\006\b\n\000\032\004\b\020\020\016R\021\020\021\032\0020\022¢\006\b\n\000\032\004\b\023\020\024R\021\020\025\032\0020\f¢\006\b\n\000\032\004\b\026\020\016¨\006\027"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/VcsResolveConflictsTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll", "()Ljava/util/List;", "baseContent", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getBaseContent", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "leftContent", "getLeftContent", "mergeConflicts", "Lai/grazie/model/task/library/v2/vcs/VcsConflictsListAttr;", "getMergeConflicts", "()Lai/grazie/model/task/library/v2/vcs/VcsConflictsListAttr;", "rightContent", "getRightContent", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 27 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text leftContent = new AttributeDescriptor.Text("leftContent"); @NotNull public final AttributeDescriptor.Text getLeftContent() { return leftContent; } @NotNull
/* 28 */   private static final AttributeDescriptor.Text rightContent = new AttributeDescriptor.Text("rightContent"); @NotNull public final AttributeDescriptor.Text getRightContent() { return rightContent; } @NotNull
/* 29 */   private static final AttributeDescriptor.Text baseContent = new AttributeDescriptor.Text("baseContent"); @NotNull public final AttributeDescriptor.Text getBaseContent() { return baseContent; } @NotNull
/* 30 */   private static final VcsConflictsListAttr mergeConflicts = new VcsConflictsListAttr("conflicts"); @NotNull public final VcsConflictsListAttr getMergeConflicts() { return mergeConflicts; } @NotNull
/*    */   private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull
/* 32 */   public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[4]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)leftContent; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)rightContent; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)baseContent; arrayOfAttributeDescriptor[3] = (AttributeDescriptor)mergeConflicts; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\vcs\VcsResolveConflictsTask$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */