/*    */ package ai.grazie.model.task.exec;
/*    */ 
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import ai.grazie.utils.attributes.AttributesBuilder;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.MagicApiIntrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KCallable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.SerializersKt;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\020\016\n\000\n\002\020\021\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\032'\020\000\032\0020\0012\032\020\002\032\016\022\n\b\001\022\006\022\002\b\0030\0040\003\"\006\022\002\b\0030\004¢\006\002\020\005\032.\020\006\032\0020\007\"\n\b\000\020\b\030\001*\0020\t*\0020\n2\006\020\013\032\0020\f2\006\020\r\032\002H\bH\b¢\006\002\020\016\032.\020\006\032\0020\007\"\n\b\000\020\b\030\001*\0020\t*\0020\n2\006\020\013\032\0020\0012\006\020\r\032\002H\bH\b¢\006\002\020\017\0320\020\020\032\0020\007\"\n\b\000\020\b\030\001*\0020\t*\0020\n2\006\020\013\032\0020\f2\b\020\r\032\004\030\001H\bH\b¢\006\002\020\016\0320\020\020\032\0020\007\"\n\b\000\020\b\030\001*\0020\t*\0020\n2\006\020\013\032\0020\0012\b\020\r\032\004\030\001H\bH\b¢\006\002\020\017¨\006\021"}, d2 = {"fqdn", "", "callables", "", "Lkotlin/reflect/KCallable;", "([Lkotlin/reflect/KCallable;)Ljava/lang/String;", "obj", "", "T", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "key", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "value", "(Lai/grazie/utils/attributes/AttributesBuilder;Lai/grazie/utils/attributes/Attributes$Key$Json;Ljava/lang/Object;)V", "(Lai/grazie/utils/attributes/AttributesBuilder;Ljava/lang/String;Ljava/lang/Object;)V", "optObj", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nTaskParametersAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskParametersAttributes.kt\nai/grazie/model/task/exec/TaskParametersAttributesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,54:1\n53#1:55\n53#1:59\n1#2:56\n1#2:60\n1#2:62\n28#3:57\n28#3:58\n28#3:61\n28#3:63\n*S KotlinDebug\n*F\n+ 1 TaskParametersAttributes.kt\nai/grazie/model/task/exec/TaskParametersAttributesKt\n*L\n47#1:55\n51#1:59\n47#1:56\n51#1:60\n47#1:57\n49#1:58\n51#1:61\n53#1:63\n*E\n"})
/*    */ public final class TaskParametersAttributesKt
/*    */ {
/*    */   @NotNull
/*    */   public static final String fqdn(@NotNull KCallable... callables) {
/* 45 */     Intrinsics.checkNotNullParameter(callables, "callables"); return ArraysKt.joinToString$default((Object[])callables, ".", null, null, 0, null, TaskParametersAttributesKt$fqdn$1.INSTANCE, 30, null); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\n\020\002\032\006\022\002\b\0030\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/reflect/KCallable;", "invoke"}) static final class TaskParametersAttributesKt$fqdn$1 extends Lambda implements Function1<KCallable<?>, CharSequence> { public final CharSequence invoke(KCallable it) { Intrinsics.checkNotNullParameter(it, "it"); return it.getName(); }
/*    */ 
/*    */     
/*    */     public static final TaskParametersAttributesKt$fqdn$1 INSTANCE = new TaskParametersAttributesKt$fqdn$1();
/*    */     
/*    */     TaskParametersAttributesKt$fqdn$1() {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\exec\TaskParametersAttributesKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */