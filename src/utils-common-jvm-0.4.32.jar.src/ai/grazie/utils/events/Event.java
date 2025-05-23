/*   */ package ai.grazie.utils.events;
/*   */ @Serializable
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b'\030\000 \0172\0020\001:\001\017B\031\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\002\020\006B\005¢\006\002\020\007J!\020\b\032\0020\t2\006\020\n\032\0020\0002\006\020\013\032\0020\f2\006\020\r\032\0020\016HÇ\001¨\006\020"}, d2 = {"Lai/grazie/utils/events/Event;", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "utils-common"})
/*   */ public abstract class Event {
/*   */   @NotNull
/* 6 */   public static final Companion Companion = new Companion(null); @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); public Event() {} @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { return (KSerializer<Object>)new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(Event.class), new java.lang.annotation.Annotation[0]); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/events/Event$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/events/Event;", "utils-common"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Event> serializer() { return get$cachedSerializer(); }
/*   */      }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\events\Event.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */