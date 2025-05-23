/*    */ package ai.grazie.code.indexing.model.cluster;
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.json.JsonClassDiscriminator;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0000\004HÆ\001¨\006\005"}, d2 = {"Lai/grazie/code/indexing/model/cluster/ClusterType$DirLevelBased;", "Lai/grazie/code/indexing/model/cluster/ClusterType;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "model-indexing"})
/*    */ public final class DirLevelBased extends ClusterType {
/*    */   @NotNull
/* 14 */   public static final DirLevelBased INSTANCE = new DirLevelBased(); @NotNull public final KSerializer<DirLevelBased> serializer() { return get$cachedSerializer(); } private DirLevelBased() {
/* 15 */     super(null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\cluster\ClusterType$DirLevelBased.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */