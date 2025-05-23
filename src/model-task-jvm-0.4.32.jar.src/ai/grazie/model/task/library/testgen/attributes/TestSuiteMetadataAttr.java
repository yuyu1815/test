/*    */ package ai.grazie.model.task.library.testgen.attributes;
/*    */ 
/*    */ import ai.grazie.model.task.library.testgen.TestSuiteMetadata;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\n\022\006\022\004\030\0010\0020\001B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\020\020\006\032\0020\0022\006\020\007\032\0020\004H\024J\020\020\b\032\0020\0042\006\020\007\032\0020\002H\024¨\006\t"}, d2 = {"Lai/grazie/model/task/library/testgen/attributes/TestSuiteMetadataAttr;", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "Lai/grazie/model/task/library/testgen/TestSuiteMetadata;", "name", "", "(Ljava/lang/String;)V", "fromJson", "value", "toJson", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nTestGenerationContextsAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestGenerationContextsAttributes.kt\nai/grazie/model/task/library/testgen/attributes/TestSuiteMetadataAttr\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,41:1\n70#2:42\n28#2:43\n*S KotlinDebug\n*F\n+ 1 TestGenerationContextsAttributes.kt\nai/grazie/model/task/library/testgen/attributes/TestSuiteMetadataAttr\n*L\n22#1:42\n26#1:43\n*E\n"})
/*    */ public final class TestSuiteMetadataAttr
/*    */   extends AttributeDescriptor.Json<TestSuiteMetadata>
/*    */ {
/*    */   public TestSuiteMetadataAttr(@NotNull String name) {
/* 20 */     super(name, false);
/*    */   } @NotNull
/* 22 */   protected TestSuiteMetadata fromJson(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$parse = 0; return 
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
/* 42 */       (TestSuiteMetadata)this_$iv.parse((DeserializationStrategy)TestSuiteMetadata.Companion.serializer(), value); } @NotNull protected String toJson(@NotNull TestSuiteMetadata value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/* 43 */     return this_$iv.string((SerializationStrategy)TestSuiteMetadata.Companion.serializer(), value); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\testgen\attributes\TestSuiteMetadataAttr.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */