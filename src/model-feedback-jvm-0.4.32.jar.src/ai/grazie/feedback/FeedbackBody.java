/*    */ package ai.grazie.feedback;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\b7\030\000 \0232\0020\001:\001\023B\031\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\002\020\006B\007\b\004¢\006\002\020\007J!\020\f\032\0020\r2\006\020\016\032\0020\0002\006\020\017\032\0020\0202\006\020\021\032\0020\022HÇ\001R\022\020\b\032\0020\tX¦\004¢\006\006\032\004\b\n\020\013\001\002\024\025¨\006\026"}, d2 = {"Lai/grazie/feedback/FeedbackBody;", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "feedbackType", "Lai/grazie/feedback/FeedbackType;", "getFeedbackType", "()Lai/grazie/feedback/FeedbackType;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Lai/grazie/feedback/FeedbackCompletion;", "Lai/grazie/feedback/ProblemFalsePositive;", "model-feedback"})
/*    */ public abstract class FeedbackBody {
/*    */   @NotNull
/* 13 */   public static final Companion Companion = new Companion(null); private FeedbackBody() {} @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); @NotNull public abstract FeedbackType getFeedbackType(); @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(FeedbackCompletion.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ProblemFalsePositive.class); KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)FeedbackCompletion.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)ProblemFalsePositive.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.feedback.FeedbackBody", Reflection.getOrCreateKotlinClass(FeedbackBody.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/feedback/FeedbackBody$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/feedback/FeedbackBody;", "model-feedback"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<FeedbackBody> serializer() { return get$cachedSerializer(); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-feedback-jvm-0.4.32.jar!\ai\grazie\feedback\FeedbackBody.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */