/*    */ package ai.grazie.code.indexing.model;
/*    */ 
/*    */ import ai.grazie.code.indexing.model.cluster.ClusterType;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\016\n\002\030\002\n\002\030\002\n\000\032\016\020\000\032\004\030\0010\001*\0020\002H\002\032\016\020\000\032\004\030\0010\001*\0020\003H\002¨\006\004"}, d2 = {"forDescriptor", "", "Lai/grazie/code/indexing/model/IndexEnvironment;", "Lai/grazie/code/indexing/model/cluster/ClusterType;", "model-indexing"})
/*    */ public final class IndexDescriptorKt
/*    */ {
/*    */   private static final String forDescriptor(ClusterType $this$forDescriptor) {
/* 48 */     return 
/* 49 */       Intrinsics.areEqual($this$forDescriptor, ClusterType.DirLevelBased.INSTANCE) ? null : 
/* 50 */       Reflection.getOrCreateKotlinClass($this$forDescriptor.getClass()).getSimpleName();
/*    */   }
/*    */   private static final String forDescriptor(IndexEnvironment $this$forDescriptor) {
/* 53 */     IndexEnvironment indexEnvironment = $this$forDescriptor;
/*    */     
/* 55 */     if (indexEnvironment instanceof IndexEnvironment.Stable) {  } else { throw new NoWhenBranchMatchedException(); }
/*    */     
/*    */     return (indexEnvironment instanceof IndexEnvironment.Benchmark) ? $this$forDescriptor.getId() : "JD-Core does not support Kotlin";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\IndexDescriptorKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */